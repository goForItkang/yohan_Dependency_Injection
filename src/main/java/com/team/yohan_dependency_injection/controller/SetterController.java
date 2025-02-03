package com.team.yohan_dependency_injection.controller;

import com.team.yohan_dependency_injection.service.SetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterController {
    private SetterService setterService;

    //setter로 의존성 주입
    @Autowired
    public void setSetterService(SetterService setterService) {
        this.setterService = setterService;
    }
}
