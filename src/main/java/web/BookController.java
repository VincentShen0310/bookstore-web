package web;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import common.Page;
import entity.Book;
import service.BookService;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/list")
	public String list(Model model,HttpServletRequest request,Page page){
		List<Book> list=bookService.queryBooksByCondition(request.getParameter("searchinfo"), page);
		String currentPage = request.getParameter("currentPage");
		Pattern pattern = Pattern.compile("[0-9]{1,9}");
		if(currentPage == null ||  !pattern.matcher(currentPage).matches()) {
			page.setCurrentPage(1);
		} else {
			page.setCurrentPage(Integer.valueOf(currentPage));
		}
		
		request.setAttribute("searchinfo", request.getParameter("searchinfo"));
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		return "book/list";
	}
		
	@RequestMapping(value="/{id}/detail")
	public String detail(Model model,@PathVariable("id") int id){
		if (id==0) {
			return "redirect:/book/list";
		}
		Book book=bookService.queryBookByID(id);
		if (book==null) {
			return "redirect:/book/list";
		}
		model.addAttribute("bookdetail", book);
		return "book/detail";
	}
	
	@RequestMapping(value = "/{id}/download")
	@ResponseBody
	public ResponseEntity<byte[]> download(@PathVariable("id") int id) throws IOException{
		Book book=bookService.queryBookByID(id);
		String path="D:\\17992\\"+book.getName()+".txt";  
        File file=new File(path);  
        HttpHeaders headers = new HttpHeaders();    
        String fileName=new String((book.getAuthor().getName()+"-"+book.getName()+".txt").getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题  
        headers.setContentDispositionFormData("attachment", fileName);   
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);   
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);  
		
	}
	
}
