package service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import common.Page;
import dao.BookDAO;
import entity.Book;
import service.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	private BookDAO bookDAO;
	
	public List<Book> queryBooksByCondition(String searchinfo,Page page) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("page", page);
		map.put("searchinfo", searchinfo);
		return bookDAO.queryBooksByCondition(map);
	}

}
