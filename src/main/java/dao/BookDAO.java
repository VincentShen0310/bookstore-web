package main.java.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import main.java.entity.Book;

public interface BookDAO {
	//根据ID查询图书信息
	Book queryBookByID(@Param("id") int id);
	
	//查询所有图书信息
	List<Book> queryAllBooks();

	//根据条件查询信息
	List<Book> queryBooksByCondition(Map<String, Object> map);
	
	//根据作者查询图书
	List<Book> queryBookByAuthorByCondition(Map<String, Object> map);
}
