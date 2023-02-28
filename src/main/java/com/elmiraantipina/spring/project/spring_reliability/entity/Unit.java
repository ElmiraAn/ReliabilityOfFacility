package com.elmiraantipina.spring.project.spring_reliability.entity;


import javax.persistence.*;


@Entity
@Table(name = "unit")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "id_system")
    private int id_system;

    public Unit() {
    }

    public Unit(int id, String name, int id_system) {
        this.id = id;
        this.name = name;
        this.id_system = id_system;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_system() {
        return id_system;
    }

    public void setId_system(int id_system) {
        this.id_system = id_system;
    }
}
