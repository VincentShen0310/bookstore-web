package main.java.service;

import java.util.List;

import main.java.entity.Author;

public interface AuthorService {

	Author queryAuthorByID(int id);

	List<Author> queryAuthorsByCondition(String name, String description);

}
