package com.author.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Optional<BooksOfAuthor> getBookByid(Integer id) {
		// TODO Auto-generated method stub
		return aurhorRepository.findById(id);
	}

	@Override
	public List<BooksOfAuthor> getAllBooks() {
		// TODO Auto-generated method stub
		return aurhorRepository.findAll();
	}


	
		
	

}
