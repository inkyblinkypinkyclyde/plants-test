package com.example.plantstest.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "plants")
public class Plant implements Serializable {
    @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Plant(String name) {
        this.name = name;
    }

    public Plant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
