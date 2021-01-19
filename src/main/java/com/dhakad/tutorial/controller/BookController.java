package com.dhakad.tutorial.controller;

import com.dhakad.tutorial.model.Book;
import com.dhakad.tutorial.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/v1/")
public class BookController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    //this is to get all book list
    @CrossOrigin(origins = "*")
    @RequestMapping("/books")
    public List<Book> getBooks(){
        LOGGER.info("BookController NBookList :"+bookService.getBookList().stream().toArray());
        return bookService.getBookList();
    }

    //this is to get book object by id
   // @CrossOrigin(origins = "http://localhost:9999")
    @CrossOrigin(origins = "*")
    @RequestMapping("/books/{id}")
    public Optional<Book> getBook(@PathVariable String id)
    {
        LOGGER.info("BookController NBookList :"+bookService.getBookList().stream().toArray());
        return bookService.getBook(id);
    }

    //this is to add book
   // @CrossOrigin(origins = "http://localhost:9999")
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST, value = "/books/")
    public void addBook(@RequestBody Book book)
    {
         bookService.addBook(book);
    }

    //this is to add book
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void updateBook(@PathVariable String id,@RequestBody Book book)
    {
        bookService.updateBook(id,book);
    }

    //this is to add book
   // @CrossOrigin(origins = "http://localhost:9999")
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{id}")
    public void deleteBook(@PathVariable String id)
    {
        bookService.deleteBook(id);
    }

}
