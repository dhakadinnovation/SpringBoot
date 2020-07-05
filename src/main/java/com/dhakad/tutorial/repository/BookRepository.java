package com.dhakad.tutorial.repository;

import com.dhakad.tutorial.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,String> {

}
