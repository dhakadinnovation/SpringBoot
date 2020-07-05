package com.dhakad.tutorial.service;

import com.dhakad.tutorial.model.Book;
import com.dhakad.tutorial.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    private List<Book> bookList = new ArrayList<>(
            Arrays.asList(
                    new Book("java","java1","its very simple programming"),
                    new Book("c#","c#","its very simple programming"),
                    new Book("cpp","cpp","its very simple programming"),
                    new Book("c","c","its very simple programming")
            )
    );

    public List<Book> getBookList(){
        //return  bookList;
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(n->books.add((Book)n));
        return books;
    }

    public Optional<Book> getBook(String id)
    {
        //return  bookList.stream().filter(t->t.getId().equals(id)).findFirst().get();

        return bookRepository.findById(id);
    }
    public void addBook(Book book)
    {
       // bookList.add(book);
        bookRepository.save(book);
    }
    public void updateBook(String id, Book book)
    {
       /* for (int i =0; i<bookList.size(); i++){
            Book bookItem = bookList.get(i);
            if (bookItem.getId().equals(id))
            {
                bookList.set(i,book);
                return;
            }

        }*/
        bookRepository.save(book);
    }
    public void deleteBook(String id)
    {
       // bookList.removeIf(t->t.getId().equals(id));
        bookRepository.deleteById(id);
    }
}
