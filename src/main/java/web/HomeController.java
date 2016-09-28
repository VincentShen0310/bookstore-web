package web;

import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import common.Page;
import entity.Book;
import service.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private HomeService homeService;
	
	@RequestMapping(value="/")
	public String index(){
		return "/index";
	}
	
	@RequestMapping(value="/search")
	public String search(Model model,HttpServletRequest request,Page page){
		List<Book> list=homeService.queryBooksByCondition(request.getParameter("searchinfo"),page);
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
}
