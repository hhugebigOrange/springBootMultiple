package com.springbootmultiple.web.controller;

import com.springbootmultiple.service.BaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("BaseController相关的api")
public class BaseController {

    @Autowired
    private BaseService baseService;

    @PostMapping("/getTest")
    @ApiOperation(value = "测试", notes = "测试用")
    public String getUser(){
        return baseService.getTestCount();
    }

}
