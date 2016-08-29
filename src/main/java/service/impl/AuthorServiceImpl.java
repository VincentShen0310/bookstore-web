package main.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.dao.AuthorDAO;
import main.java.entity.Author;
import main.java.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	private AuthorDAO authorDAO;

	public Author queryAuthorByID(int id) {
		return authorDAO.queryAuthorByID(id);
	}

	public List<Author> queryAuthorsByCondition(String name,
			String description) {
		return authorDAO.queryAuthorsByCondition(name, description);
	}

	
}
