package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.Userservice;
import com.example.demo.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private Userservice userservice;

    @RequestMapping("/findall")
    public ResultEntity list(User user){

        List<HashMap<String,String>> list=userservice.findall(user);
        System.out.println();
        return ResultEntity.ok(list);
    }



}
