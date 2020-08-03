package com.example.demo.dao.Repository;

import com.example.demo.dao.Model.Zespol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZespolRepo extends CrudRepository<Zespol, Long> {
}
