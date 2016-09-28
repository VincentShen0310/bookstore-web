package service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import common.Page;
import dao.AuthorDAO;
import entity.Author;
import service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	private AuthorDAO authorDAO;

	public Author queryAuthorByID(int id) {
		return authorDAO.queryAuthorByID(id);
	}

	public List<Author> queryAuthorsByCondition(String name,
			String description, Page page) {
		Map<String, Object> map=new HashMap<String, Object>();
		Author author=new Author();
		author.setName(name);
		author.setDescription(description);
		map.put("author", author);
		map.put("page", page);
		return authorDAO.queryAuthorsByCondition(map);
	}

	
}
