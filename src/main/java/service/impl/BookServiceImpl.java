package main.java.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.common.Page;
import main.java.dao.BookDAO;
import main.java.entity.Book;
import main.java.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;

	public Book queryBookByID(int id) {
		return bookDAO.queryBookByID(id);
	}

	public List<Book> queryAllBooks() {
		return bookDAO.queryAllBooks();
	}

	public List<Book> queryBooksByCondition(String searchinfo,Page page) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("page", page);
		map.put("searchinfo", searchinfo);
		return bookDAO.queryBooksByCondition(map);
	}

	public List<Book> queryBookByAuthorByCondition(int id,Page page) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("id", id);
		map.put("page", page);
		return bookDAO.queryBookByAuthorByCondition(map);
	}
	
}
