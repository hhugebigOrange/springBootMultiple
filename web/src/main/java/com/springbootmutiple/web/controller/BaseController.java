package com.springbootmutiple.web.controller;

import com.springbootmultiple.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping("/123")
    public User getUser(){
        return new User();
    }

}
