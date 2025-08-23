package com.github.jamonedero92.bookshelf_manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookshelfController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/books-list")
    public String showBooksList(ModelMap model){

        return "books-list";
    }
}
