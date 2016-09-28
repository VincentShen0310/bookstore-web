package dao;

import java.util.List;
import java.util.Map;

import entity.Author;

import org.apache.ibatis.annotations.Param;

public interface AuthorDAO {

	// 根据ID查询作者信息
	Author queryAuthorByID(@Param("id") int id);

	//根据条件查询信息
	List<Author> queryAuthorsByCondition(Map<String, Object> map);
}
