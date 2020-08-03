package com.example.demo.api;

import com.example.demo.dao.Model.Pracownik;
import com.example.demo.manager.PracownikManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pracownik")
public class PracownikApi {

    private PracownikManager pracownikManager;

    @Autowired
    public PracownikApi(PracownikManager pracownikManager) {
        this.pracownikManager = pracownikManager;
    }

    @PostMapping(value = "/save")
    public Pracownik addPracownik(@RequestBody Pracownik pracownik) {
        return pracownikManager.save(pracownik);
    }

    @PostMapping(value = "/update")
    public Pracownik updatePracownik(@RequestBody Pracownik pracownik) {
        return pracownikManager.save(pracownik);
    }

    @GetMapping(value = "/get")
    public Iterable<Pracownik> getAll() {
        return pracownikManager.findAll();
    }


    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        pracownikManager.delete(id);
    }

}
