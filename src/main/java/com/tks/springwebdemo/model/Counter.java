package com.tks.springwebdemo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Counter {
    
    private int counter = 0;

    public int getCounter()
    {
        return counter;
    }

    public void incrementCounter( )
    {
        this.counter++;
    }

    
}