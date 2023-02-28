package com.elmiraantipina.spring.project.spring_reliability.dao;

import com.elmiraantipina.spring.project.spring_reliability.entity.Failure;

import java.util.List;

public interface FailureDao {
    public List<Failure> getAllFails();
}
