package com.elmiraantipina.spring.project.spring_reliability.entity;


import javax.persistence.*;

@Entity
@Table(name="system")
public class FacilitySystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_system")
    private int id;

   /* @Column(name = "name")
    private String name;

    @Column(name = "id_facility")
    private int id_facility;

    public FacilitySystem() {
    }

    public FacilitySystem(int id, String name, int id_facility) {
        this.id = id;
        this.name = name;
        this.id_facility = id_facility;
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

    public int getId_facility() {
        return id_facility;
    }

    public void setId_facility(int id_facility) {
        this.id_facility = id_facility;
    }*/
}
