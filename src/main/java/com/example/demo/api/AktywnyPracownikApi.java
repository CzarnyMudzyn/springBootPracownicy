package com.example.demo.api;

import com.example.demo.dao.Model.AktywnyPracownik;
import com.example.demo.dao.Model.Pracownik;
import com.example.demo.manager.AktywnyPracownikManager;
import com.example.demo.manager.PracownikManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/aktywnyPracownik")
public class AktywnyPracownikApi {

    private PracownikManager pracownikManager;
    private AktywnyPracownikManager aktywnyPracownikManager;

    @Autowired
    public void aktywnyPracownikApi(PracownikManager pracownikManager) {
        this.pracownikManager = pracownikManager;
    }

    @Autowired
    public void aktywnyPracownikApi(AktywnyPracownikManager aktywnyPracownikManager) {
        this.aktywnyPracownikManager = aktywnyPracownikManager;
    }

    @PostMapping(value = "/save")
    public AktywnyPracownik addAktywnyPracownik(@RequestBody AktywnyPracownik aktywnyPracownik) {
        return aktywnyPracownikManager.save(aktywnyPracownik);
    }

    @PostMapping(value = "/update")
    public AktywnyPracownik updateAktywnyPracownik(@RequestBody AktywnyPracownik aktywnyPracownik) {
        return aktywnyPracownikManager.save(aktywnyPracownik);
    }

    @GetMapping(value = "/get")
    public Iterable<Pracownik> getAll() {
        return pracownikManager.findAllActiv();
    }


    @GetMapping(value = "/activPracownikData")
    public Iterable<AktywnyPracownik> getAllInfo() {
        return aktywnyPracownikManager.findAll();
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        aktywnyPracownikManager.delete(id);
    }

}
