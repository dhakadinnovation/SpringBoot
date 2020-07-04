package com.dhakad.tutorial.model;

public class Book {
    private String id;
    private String name;
    private String discription;

    public Book(String id, String name, String discription) {
        this.id = id;
        this.name = name;
        this.discription = discription;
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
}
