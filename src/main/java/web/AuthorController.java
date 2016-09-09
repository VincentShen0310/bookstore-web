package main.java.web;

import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import main.java.common.Page;
import main.java.entity.Author;
import main.java.entity.Book;
import main.java.service.AuthorService;
import main.java.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/list")
	public String list(Model model,Author author,Page page,HttpServletRequest request){
		
		List<Author> list=authorService.queryAuthorsByCondition(author.getName(), author.getDescription(),page);
		
		String currentPage = request.getParameter("currentPage");
		Pattern pattern = Pattern.compile("[0-9]{1,9}");
		if(currentPage == null ||  !pattern.matcher(currentPage).matches()) {
			page.setCurrentPage(1);
		} else {
			page.setCurrentPage(Integer.valueOf(currentPage));
		}
		
		model.addAttribute("list", list);
		model.addAttribute("authorsearch", author);
		model.addAttribute("page", page);
		return "author/list";
	}
	
	@RequestMapping(value="/{id}/detail",method=RequestMethod.GET)
	public String detail(Model model,@PathVariable("id") int id,Page page){
		if (id==0) {
			return "redirect:/author/list";
		}
		Author author=authorService.queryAuthorByID(id);
		if (author==null) {
			return "redirect:/author/list";
		}
		List<Book> bList=bookService.queryBookByAuthorByCondition(id,page);
		model.addAttribute("authordetail", author);
		model.addAttribute("blist", bList);
		model.addAttribute("page", page);
		return "author/detail";
	}
	
}
