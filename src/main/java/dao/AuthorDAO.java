package main.java.dao;

import java.util.List;

import main.java.entity.Author;

import org.apache.ibatis.annotations.Param;

public interface AuthorDAO {

	// 根据ID查询作者信息
	Author queryAuthorByID(@Param("id") int id);

	//根据条件查询信息
	List<Author> queryAuthorsByCondition(@Param("name") String name,
			@Param("description") String description);
}
