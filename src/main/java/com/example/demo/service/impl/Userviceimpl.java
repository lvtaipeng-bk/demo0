package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class Userviceimpl implements Userservice {

    @Autowired
    private UserDao userDao;


    @Override
    public List<HashMap<String,String>> findall(User user) {
        List<HashMap<String,String>> map=userDao.findall(user);
        return map;
    }
}
