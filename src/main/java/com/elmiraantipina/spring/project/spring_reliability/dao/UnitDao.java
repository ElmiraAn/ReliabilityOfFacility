package com.elmiraantipina.spring.project.spring_reliability.dao;

import com.elmiraantipina.spring.project.spring_reliability.entity.Failure;
import com.elmiraantipina.spring.project.spring_reliability.entity.Unit;

import java.util.List;

public interface UnitDao {

    public List<Unit> getAllUnits();

    public void saveUnit(Unit unit);

    public Unit getUnit(int id);

    public void deleteUnit(int id);

}
