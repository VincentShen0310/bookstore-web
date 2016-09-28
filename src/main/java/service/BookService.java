package service;

import java.util.List;

import common.Page;
import entity.Book;

public interface BookService {

	Book queryBookByID(int id);

	List<Book> queryAllBooks();

	List<Book> queryBooksByCondition(String searchinfo, Page page);
	
	List<Book> queryBookByAuthorByCondition(int id,Page page);
}
