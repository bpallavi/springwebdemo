package com.tks.springwebdemo.Service;

import java.util.List;

import com.tks.springwebdemo.model.Book;
import com.tks.springwebdemo.model.BookRepository;

import org.springframework.stereotype.Service;

@Service
		public class BookService {

		    private final BookRepository bookRepository;

		    public BookService(BookRepository bookRepository){
			this.bookRepository = bookRepository;
		    }

		    public void saveBook(Book book){
			bookRepository.save(book);
		    }

		    public List<Book> getAllBooks(){
			return bookRepository.getAllBooks();
		    }


	}