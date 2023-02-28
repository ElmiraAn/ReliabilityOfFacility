package com.elmiraantipina.spring.project.spring_reliability.dao;

import com.elmiraantipina.spring.project.spring_reliability.entity.Failure;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
}
