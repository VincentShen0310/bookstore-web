package main.java.web;

import main.java.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}
