package com.team.yohan_dependency_injection.controller;

import com.team.yohan_dependency_injection.dao.ConstructorDao;
import com.team.yohan_dependency_injection.service.ConstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {

    private final ConstructorService constructorService;
    //생성자로 의존성 주입
    @Autowired ConstructorController(ConstructorService constructorService) {
        this.constructorService = constructorService;
    }

}
