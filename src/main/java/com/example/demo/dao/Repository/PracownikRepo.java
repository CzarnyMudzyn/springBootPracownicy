package com.example.demo.dao.Repository;


import com.example.demo.dao.Model.Pracownik;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PracownikRepo extends CrudRepository<Pracownik, Long> {

    List<Pracownik> findAllByAktywnyPracownikIsNotNull();

    Pracownik findByAktywnyPracownik_Id(Long id);

}
