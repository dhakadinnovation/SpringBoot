package com.dhakad.units.controller;

import com.dhakad.tutorial.model.Book;
import com.dhakad.units.model.Unit;
import com.dhakad.units.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UnitController {
    @Autowired
    private UnitService unitService;

    //this is to get all book list
    @RequestMapping("/books/{id}/units")
    public List<Unit> getUnits(@PathVariable String id){
        return unitService.getUnitList(id);
    }

    //this is to get book object by id
    @RequestMapping("/books/{bookId}/units/{id}")
    public Optional<Unit> getUnit(@PathVariable String id)
    {
        return unitService.getUnit(id);
    }

    //this is to add bookdata
    @RequestMapping(method = RequestMethod.POST, value = "/books/{bookId}/units/")
    public void addUnit(@RequestBody Unit unit, @PathVariable String bookId)
    {
         unit.setBook(new Book(bookId,"",""));
         unitService.addUnit(unit);
    }

    //this is to add book
    @RequestMapping(method = RequestMethod.PUT, value = "/books/{bookId}/units/{id}")
    public void updateUnit(@PathVariable String id, @PathVariable String bookId, @RequestBody Unit unit)
    {
        unit.setBook(new Book(bookId,"",""));
        unitService.updateUnit(unit);
    }

    //this is to add book
    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{bookId}/units/{id}")
    public void deleteUnit(@PathVariable String id)
    {
        unitService.deleteUnit(id);
    }

}
