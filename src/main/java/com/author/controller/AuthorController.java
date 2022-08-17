package com.author.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.author.model.BooksOfAuthor;
import com.author.service.IAuthorService;

@RestController
public class AuthorController {

	@Autowired
	IAuthorService authorservice;
	
	@PostMapping("/author")
	public Integer createAuthor(@RequestBody BooksOfAuthor author ) {
		Integer id = authorservice.saveAuthork(author);
		System.out.println(id);
		return id;
	}
	@GetMapping("/allbooks")
	public List<BooksOfAuthor> getAllEmployee(){
		return authorservice.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Optional<BooksOfAuthor> getBooks(@PathVariable Integer id){
		Optional<BooksOfAuthor> books = authorservice.getBookByid(id);
		return books;
	}
		
	
}
