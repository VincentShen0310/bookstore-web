package service;

import java.util.List;

import common.Page;
import entity.Book;

public interface HomeService {

	List<Book> queryBooksByCondition(String searchinfo, Page page);

}
