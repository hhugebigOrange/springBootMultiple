package com.wt.controller;

import com.wt.service.BaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("BaseController")
public class BaseController {

    @Autowired
    private BaseService baseService;

    @PostMapping("/getTest")
    @ApiOperation(value = "测试", notes = "测试用")
    public String getUser(){
        return baseService.getTestCount()+123;
    }

}
