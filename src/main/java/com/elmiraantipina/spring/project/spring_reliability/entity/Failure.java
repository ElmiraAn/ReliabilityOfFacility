package com.elmiraantipina.spring.project.spring_reliability.entity;


import javax.persistence.*;

@Entity
@Table(name = "failure")
public class Failure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_failure")
    private int id_failure;

    @Column(name = "name")
    private String name;

    @Column(name = "failure_duration")
    private int hours; //в часах

    @Column(name = "loss_of_power")
    private String loss_of_power;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_unit")
    private Unit unit;

    public Failure() {
    }

    public Failure(int id_failure, String name, int hours, String loss_of_power) {
        this.id_failure = id_failure;
        this.name = name;
        this.hours = hours;
        this.loss_of_power = loss_of_power;
    }

    public int getId_failure() {
        return id_failure;
    }

    public void setId_failure(int id_failure) {
        this.id_failure = id_failure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getLoss_of_power() {
        return loss_of_power;
    }

    public void setLoss_of_power(String loss_of_power) {
        this.loss_of_power = loss_of_power;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Failure{" +
                "id_failure=" + id_failure +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", loss_of_power='" + loss_of_power + '\'' +
                '}';
    }
}
