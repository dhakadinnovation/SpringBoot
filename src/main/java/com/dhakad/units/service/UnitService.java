package com.dhakad.units.service;

import com.dhakad.units.model.Unit;
import com.dhakad.units.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UnitService {
    @Autowired
    private UnitRepository unitRepository;

    public List<Unit> getUnitList(String id){
        //return  bookList;
        List<Unit> units = new ArrayList<>();
        unitRepository.findByBookId(id).forEach(n-> units.add((Unit)n));
        return units;
    }

    public Optional<Unit> getUnit(String id)
    {
        //return  bookList.stream().filter(t->t.getId().equals(id)).findFirst().get();

        return unitRepository.findById(id);
    }
    public void addUnit(Unit unit)
    {
       // bookList.add(book);
        unitRepository.save(unit);
    }
    public void updateUnit(Unit unit)
    {
       /* for (int i =0; i<bookList.size(); i++){
            Book bookItem = bookList.get(i);
            if (bookItem.getId().equals(id))
            {
                bookList.set(i,book);
                return;
            }

        }*/
        unitRepository.save(unit);
    }
    public void deleteUnit(String id)
    {
       // bookList.removeIf(t->t.getId().equals(id));
        unitRepository.deleteById(id);
    }
}
