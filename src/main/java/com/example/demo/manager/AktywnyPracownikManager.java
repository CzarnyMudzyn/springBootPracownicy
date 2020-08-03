package com.example.demo.manager;

import com.example.demo.dao.Model.AktywnyPracownik;
import com.example.demo.dao.Model.Pracownik;
import com.example.demo.dao.Repository.AktywnyPracownikRepo;
import com.example.demo.dao.Repository.PracownikRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AktywnyPracownikManager {

    private PracownikRepo pracownikRepo;
    private AktywnyPracownikRepo aktywnyPracownikRepo;

    @Autowired
    public AktywnyPracownikManager(AktywnyPracownikRepo aktywnyPracownikRepo) {
        this.aktywnyPracownikRepo = aktywnyPracownikRepo;
    }

    @Autowired
    public void PracownikManager(PracownikRepo pracownikRepo) {
        this.pracownikRepo = pracownikRepo;
    }

    public AktywnyPracownik save(AktywnyPracownik aktywnyPracownik) {
        return aktywnyPracownikRepo.save(aktywnyPracownik);
    }

    public void delete(Long id) {
        Pracownik pracownikUpdate = pracownikRepo.findByAktywnyPracownik_Id(id);

        if (pracownikUpdate.getAktywnyPracownik().equals(null)) {
            aktywnyPracownikRepo.deleteById(id);
        } else {
            pracownikUpdate.setAktywnyPracownik(null);
            pracownikRepo.save(pracownikUpdate);
            aktywnyPracownikRepo.deleteById(id);
        }
    }

    public List<AktywnyPracownik> findAll() {
        List<AktywnyPracownik> list = new ArrayList<>();
        aktywnyPracownikRepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }


}
