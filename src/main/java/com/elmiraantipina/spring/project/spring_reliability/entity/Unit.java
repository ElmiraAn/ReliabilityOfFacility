package com.elmiraantipina.spring.project.spring_reliability.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


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

    @OneToMany(cascade = CascadeType.ALL
            , mappedBy = "unit")
    private List<Failure> failures;

    public Unit() {
    }

    public Unit(int id, String name, int id_system) {
        this.id = id;
        this.name = name;
        this.id_system = id_system;
    }

    public void addFailureToUnit(Failure failure){
        if (failures==null) {
            failures = new ArrayList<>();
        }
        failures.add(failure);
        failure.setUnit(this);
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

    public List<Failure> getFailures() {
        return failures;
    }

    public void setFailures(List<Failure> failures) {
        this.failures = failures;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", id_system=" + id_system +
                '}';
    }
}
