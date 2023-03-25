package com.tks.springwebdemo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryBookRepository implements BookRepository {

    private List<Book> bookList = new ArrayList<>();
    @Override
    public void save( Book book )
    {
       bookList.add(book);
    }

    @Override
    public List<Book> getAllBooks()
    {
        return bookList;
    }
    
}
