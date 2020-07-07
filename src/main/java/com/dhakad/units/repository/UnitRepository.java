package com.dhakad.units.repository;

import com.dhakad.units.model.Unit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UnitRepository extends CrudRepository<Unit,String> {
public List<Unit> findByBookId(String bookId);
}
