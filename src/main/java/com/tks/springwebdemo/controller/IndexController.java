package com.tks.springwebdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.tks.springwebdemo.model.*;

@Controller

@RequestMapping("/greet")
public class IndexController {
    
    @Autowired
    Counter counter;
    
    @GetMapping
    public String getGreeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model){
        counter.incrementCounter();
        model.addAttribute("messageName", name );
        model.addAttribute("counterValue", counter.getCounter() );
        return "greeting";
    }
}