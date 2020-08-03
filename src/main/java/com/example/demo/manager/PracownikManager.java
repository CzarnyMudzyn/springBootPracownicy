package com.example.demo.manager;

import com.example.demo.dao.Model.Pracownik;
import com.example.demo.dao.Repository.AktywnyPracownikRepo;
import com.example.demo.dao.Repository.PracownikRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PracownikManager {

    private PracownikRepo pracownikRepo;
    private AktywnyPracownikRepo aktywnyPracownikRepo;

    @Autowired
    public PracownikManager(PracownikRepo pracownikRepo) {
        this.pracownikRepo = pracownikRepo;
    }

    @Autowired
    public void AktywnyPracownikManager(AktywnyPracownikRepo aktywnyPracownikRepo) {
        this.aktywnyPracownikRepo = aktywnyPracownikRepo;
    }

    public Pracownik save(Pracownik pracownik) {
        return pracownikRepo.save(pracownik);
    }

    public List<Pracownik> findAll() {
        List<Pracownik> list = new ArrayList<>();
        pracownikRepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    public Iterable<Pracownik> findAllActiv() {
        Iterable<Pracownik> list = pracownikRepo.findAllByAktywnyPracownikIsNotNull();
        return list;
    }

    public void delete(Long id) {
        pracownikRepo.deleteById(id);
    }


}
