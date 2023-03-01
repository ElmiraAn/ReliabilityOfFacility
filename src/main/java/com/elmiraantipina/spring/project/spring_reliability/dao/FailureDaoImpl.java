package com.elmiraantipina.spring.project.spring_reliability.dao;

import com.elmiraantipina.spring.project.spring_reliability.entity.Failure;
import com.elmiraantipina.spring.project.spring_reliability.entity.Unit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FailureDaoImpl implements FailureDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Failure> getAllFails() {
        Session session = sessionFactory.getCurrentSession();
        List<Failure> allFails = session.createQuery("from Failure", Failure.class)
                .getResultList();
        return allFails;
    }

    @Override
    public Failure getFail(int id) {
        Session session = sessionFactory.getCurrentSession();
        Failure failure = session.get(Failure.class, id);
        return failure;
    }

    @Override
    public void deleteFail(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Failure> query = session.createQuery("delete from Failure " +
                "where id_failure=:failId");
        query.setParameter("failId", id);
        query.executeUpdate();
    }

    @Override
    public void saveFails(Failure failure) {

        /*Session session = sessionFactory.getCurrentSession();
        Query<Failure> query = session.createQuery("update from Failure " +
                "set " +
                "where unit.id=:unitId ");
        query.setParameter("unitId", id_unit);
        query.executeUpdate();*/

        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(failure);

    }


}
