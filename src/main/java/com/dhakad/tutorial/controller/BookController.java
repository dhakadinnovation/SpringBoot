package com.dhakad.tutorial.controller;

import com.dhakad.tutorial.model.Book;
import com.dhakad.tutorial.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    //this is to get all book list
    @RequestMapping("/books")
    public List<Book> getBooks(){
        return bookService.getBookList();
    }

    //this is to get book object by id
    @RequestMapping("/books/{id}")
    public Book getBook(@PathVariable String id)
    {
        return bookService.getBook(id);
    }

    //this is to add book
    @RequestMapping(method = RequestMethod.POST, value = "/books/")
    public void addBook(@RequestBody Book book)
    {
         bookService.addBook(book);
    }

    //this is to add book
    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void updateBook(@PathVariable String id,@RequestBody Book book)
    {
        bookService.updateBook(id,book);
    }

    //this is to add book
    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{id}")
    public void deleteBook(@PathVariable String id)
    {
        bookService.deleteBook(id);
    }

}