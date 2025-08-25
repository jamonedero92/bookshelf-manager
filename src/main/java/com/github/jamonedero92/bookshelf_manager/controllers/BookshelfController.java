package com.github.jamonedero92.bookshelf_manager.controllers;

import com.github.jamonedero92.bookshelf_manager.model.Book;
import com.github.jamonedero92.bookshelf_manager.model.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookshelfController {

    private BookRepository bookRepository;

    public BookshelfController(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/list-books")
    public String showBooksList(ModelMap model){
        List<Book> books= bookRepository.findAll();
        model.put("books",books);
        return "books-list";
    }

    @GetMapping("/add-book")
    public String showAddBook(ModelMap model){
        Book book=new Book();
        model.put("book",book);
        return "book-view";
    }

    @PostMapping("/save-book")
    public String saveBook( @ModelAttribute("Book") Book book){
       /* if(result.hasErrors()){
            return "book-view";
        }*/

        if(book.getID()==null){
            book.setAuthor("jorge");
            bookRepository.save(book);

        }

        return "redirect:list-books";
    }
}
