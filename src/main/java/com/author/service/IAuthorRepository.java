package com.author.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.author.model.BooksOfAuthor;

public interface IAuthorRepository extends JpaRepository<BooksOfAuthor, Integer> {

}
