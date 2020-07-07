package com.dhakad.units.model;

import com.dhakad.tutorial.model.Book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Unit {
    @Id
    private String id;
    private String name;
    private String discription;

    @ManyToOne
    private Book book;

    public Unit()
    {

    }
    public Unit(String id, String name, String discription,String bookId) {

        super();

        this.id = id;
        this.name = name;
        this.discription = discription;
        this.book = new Book(bookId,"","");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
