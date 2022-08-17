package com.author.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
}
