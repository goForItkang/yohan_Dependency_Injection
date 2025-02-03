package com.team.yohan_dependency_injection.controller;

import com.team.yohan_dependency_injection.service.FiledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FiledController {
    @Autowired
    private FiledService filedService; //필드로 의존성주입
}
