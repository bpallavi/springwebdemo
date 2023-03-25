package com.tks.springwebdemo.controller;

import java.util.List;

import com.tks.springwebdemo.Service.BookService;
import com.tks.springwebdemo.model.Book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
    this.bookService = bookService;
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){
    bookService.saveBook(book);
    return book;
    }

    @GetMapping
    public List<Book> getAllBooks(){
    return bookService. getAllBooks();
    }
}
