package com.dhakad.tutorial.controller;

import com.dhakad.tutorial.model.Book;
import com.dhakad.tutorial.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    //this is to get all book list
    //@CrossOrigin(origins = "http://localhost:9999")
    @RequestMapping("/books")
    public List<Book> getBooks(){
        return bookService.getBookList();
    }

    //this is to get book object by id
    @CrossOrigin(origins = "http://localhost:9999")
    @RequestMapping("/books/{id}")
    public Optional<Book> getBook(@PathVariable String id)
    {
        return bookService.getBook(id);
    }

    //this is to add book
    @CrossOrigin(origins = "http://localhost:9999")
    @RequestMapping(method = RequestMethod.POST, value = "/books/")
    public void addBook(@RequestBody Book book)
    {
         bookService.addBook(book);
    }

    //this is to add book
    @CrossOrigin(origins = "http://localhost:9999")
    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void updateBook(@PathVariable String id,@RequestBody Book book)
    {
        bookService.updateBook(id,book);
    }

    //this is to add book
    @CrossOrigin(origins = "http://localhost:9999")
    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{id}")
    public void deleteBook(@PathVariable String id)
    {
        bookService.deleteBook(id);
    }

}
