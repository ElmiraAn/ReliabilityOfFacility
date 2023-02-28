package com.elmiraantipina.spring.project.spring_reliability.service;

import com.elmiraantipina.spring.project.spring_reliability.dao.FailureDao;
import com.elmiraantipina.spring.project.spring_reliability.dao.UnitDao;
import com.elmiraantipina.spring.project.spring_reliability.entity.Failure;
import com.elmiraantipina.spring.project.spring_reliability.entity.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private UnitDao unitDao;
    @Autowired
    private FailureDao failDao;

    @Override
    @Transactional
    public List<Unit> getAllUnits() {

        return unitDao.getAllUnits();
    }

    @Override
    @Transactional
    public List<Failure> getAllFails() {
        return failDao.getAllFails();
    }

    @Override
    @Transactional
    public void saveUnit(Unit unit) {

        unitDao.saveUnit(unit);

    }

    @Override
    @Transactional
    public Unit getUnit(int id) {
        return unitDao.getUnit(id);
    }

    @Override
    @Transactional
    public void deleteUnit(int id) {
        unitDao.deleteUnit(id);
    }

}
