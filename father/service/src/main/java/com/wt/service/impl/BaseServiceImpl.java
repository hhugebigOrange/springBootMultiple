package com.wt.service.impl;

import com.wt.dao.UserDAO;
import com.wt.service.BaseService;
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
