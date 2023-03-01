package com.elmiraantipina.spring.project.spring_reliability.dao;

import com.elmiraantipina.spring.project.spring_reliability.entity.Failure;
import com.elmiraantipina.spring.project.spring_reliability.entity.Unit;

import java.util.List;

public interface FailureDao {
    public List<Failure> getAllFails();

    public Failure getFail(int id);

    public void deleteFail(int id);

    public void saveFails(Failure failure);
}
