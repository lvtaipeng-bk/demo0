package com.example.demo.service;

import com.example.demo.entity.User;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.List;

public interface Userservice {


    List<HashMap<String,String>> findall(User user);
}
