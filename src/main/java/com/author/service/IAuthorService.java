package com.author.service;

import java.util.List;
import java.util.Optional;

import com.author.model.BooksOfAuthor;

public interface IAuthorService {

	 Integer saveAuthork(BooksOfAuthor author);
	 
	 public Optional<BooksOfAuthor> getBookByid(Integer id);
	 
	 public List<BooksOfAuthor> getAllBooks();
	 
}
