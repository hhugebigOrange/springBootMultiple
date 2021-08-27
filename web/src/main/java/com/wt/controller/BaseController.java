package com.wt.controller;

import com.wt.service.BaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("BaseController")
@Api("BaseController")
public class BaseController {

    @Autowired
    private BaseService baseService;

    @PostMapping("/getTest")
    @ApiOperation(value = "测试", notes = "测试用")
    public String getUser(){
        return baseService.getTestCount()+123;
    }

    @GetMapping("/")
    public ModelAndView indexPage(ModelAndView modelAndView){
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
}
