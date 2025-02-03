package com.team.yohan_dependency_injection.service;

import com.team.yohan_dependency_injection.dao.ConstructorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstructorService {
    private ConstructorDao constructorDao;
    @Autowired
    public ConstructorService(ConstructorDao constructorDao) {
        this.constructorDao = constructorDao;
    }
}

