package com.author.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.model.BooksOfAuthor;

@Service
public class AuthoeServiceImpl implements IAuthorService {

	@Autowired
	IAuthorRepository aurhorRepository;
	
	@Override
	public Integer saveAuthork(BooksOfAuthor author) {
		BooksOfAuthor saveBooks = aurhorRepository.save(author);
		return saveBooks.getId();
	}

}
