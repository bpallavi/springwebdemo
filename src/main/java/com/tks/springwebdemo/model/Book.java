package com.tks.springwebdemo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

   
   
@Getter
@Setter
@Data
public class Book {

    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    private String title;
    private String ISBN;
    
    // getters - setters here. 



}
