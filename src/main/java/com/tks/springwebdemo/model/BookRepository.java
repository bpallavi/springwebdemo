package com.tks.springwebdemo.model;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository {
    
    void save(Book book);
    List<Book> getAllBooks();

}
