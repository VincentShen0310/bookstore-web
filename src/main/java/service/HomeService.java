package main.java.service;

import java.util.List;

import main.java.common.Page;
import main.java.entity.Book;

public interface HomeService {

	List<Book> queryBooksByCondition(String searchinfo, Page page);

}
