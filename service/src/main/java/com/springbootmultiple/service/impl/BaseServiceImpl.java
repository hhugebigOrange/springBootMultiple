package com.springbootmultiple.service.impl;

import com.springbootmultiple.dao.UserDAO;
import com.springbootmultiple.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseServiceImpl implements BaseService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public String getTestCount() {
        return String.valueOf(userDAO.getTestCount());
    }
}
