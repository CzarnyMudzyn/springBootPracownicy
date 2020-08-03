package com.example.demo.dao.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pracownik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private AktywnyPracownik aktywnyPracownik;
    @ManyToMany(targetEntity = Zespol.class, cascade = CascadeType.ALL)
    private List<Zespol> zespoly;

    public Pracownik() {
    }

    public Pracownik(Long id, String name, AktywnyPracownik aktywnyPracownik, List<Zespol> zespoly) {
        this.id = id;
        this.name = name;
        this.aktywnyPracownik = aktywnyPracownik;
        this.zespoly = zespoly;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AktywnyPracownik getAktywnyPracownik() {
        return aktywnyPracownik;
    }

    public void setAktywnyPracownik(AktywnyPracownik aktywnyPracownik) {
        this.aktywnyPracownik = aktywnyPracownik;
    }

    public List<Zespol> getZespoly() {
        return zespoly;
    }

    public void setZespoly(List<Zespol> zespoly) {
        this.zespoly = zespoly;
    }
}
