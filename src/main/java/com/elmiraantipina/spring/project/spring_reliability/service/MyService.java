package com.elmiraantipina.spring.project.spring_reliability.service;

import com.elmiraantipina.spring.project.spring_reliability.entity.Failure;
import com.elmiraantipina.spring.project.spring_reliability.entity.Unit;

import java.util.List;

public interface MyService {

    public List<Unit> getAllUnits();

    public List<Failure> getAllFails();

    public void saveUnit(Unit unit);

    public void saveFails(Failure failure);

    public Unit getUnit(int id);

    public Failure getFail(int id);

    public void deleteUnit(int id);

    public void deleteFail(int id);
}
