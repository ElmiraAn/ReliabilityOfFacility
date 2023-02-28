package com.elmiraantipina.spring.project.spring_reliability.service;

import com.elmiraantipina.spring.project.spring_reliability.entity.Unit;

import java.util.List;

public interface UnitService {

    public List<Unit> getAllUnits();

    public void saveUnit(Unit unit);

    public Unit getUnit(int id);

    public void deleteUnit(int id);
}
