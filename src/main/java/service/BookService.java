package main.java.service;

import java.util.List;

import main.java.common.Page;
import main.java.entity.Book;

public interface BookService {

	Book queryBookByID(int id);

	List<Book> queryAllBooks();

	List<Book> queryBooksByCondition(String searchinfo, Page page);
	
	List<Book> queryBookByAuthorByCondition(int id,Page page);
}
