package main.java.service;

import java.util.List;
import main.java.entity.Book;

public interface BookService {

	Book queryBookByID(int id);

	List<Book> queryAllBooks();

	List<Book> queryBooksByCondition(String name, String description, int status,
			int isDisplay,String authorName);
	
	List<Book> queryBookByAuthor(int id);
}
