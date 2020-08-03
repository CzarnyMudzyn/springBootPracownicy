package com.example.demo.dao.Repository;

import com.example.demo.dao.Model.AktywnyPracownik;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AktywnyPracownikRepo extends CrudRepository<AktywnyPracownik, Long> {


}
