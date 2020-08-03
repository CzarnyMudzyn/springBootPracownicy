package com.example.demo.dao.Model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Zespol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @ManyToMany(targetEntity = Pracownik.class, mappedBy = "zespoly", cascade = CascadeType.ALL)
    private List<Pracownik> pracownicy;


    public Zespol() {
    }

    public Zespol(Long id, String name) {
        this.id = id;
        this.name = name;
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

}
