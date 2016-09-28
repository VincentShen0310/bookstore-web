package service;

import java.util.List;

import common.Page;
import entity.Author;

public interface AuthorService {

	Author queryAuthorByID(int id);

	List<Author> queryAuthorsByCondition(String name, String description,Page page);

}
