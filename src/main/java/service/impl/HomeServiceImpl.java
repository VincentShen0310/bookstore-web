package main.java.service.impl;

import main.java.dao.AuthorDAO;
import main.java.entity.Author;
import main.java.service.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	private AuthorDAO authorDAO;
	
	public Author queryAuthorByID(int id) {
		return authorDAO.queryAuthorByID(id);
	}

}
