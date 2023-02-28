package com.elmiraantipina.spring.project.spring_reliability.dao;

import com.elmiraantipina.spring.project.spring_reliability.entity.Unit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class UnitDaoImpl implements UnitDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Unit> getAllUnits() {
        Session session = sessionFactory.getCurrentSession();
    List<Unit> allUnits = session.createQuery("from Unit", Unit.class)
            .getResultList();

    return allUnits;
    }

    @Override
    public void saveUnit(Unit unit) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(unit);
    }

    @Override
    public Unit getUnit(int id) {
        Session session = sessionFactory.getCurrentSession();
        Unit unit = session.get(Unit.class,id);
        return unit;
    }

    @Override
    public void deleteUnit(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Unit> query = session.createQuery("delete from Unit "+
                "where id=:unitId");

        query.setParameter("unitId", id);
        query.executeUpdate();

    }
}
