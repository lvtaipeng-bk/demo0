package com.example.demo.dao;


import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface UserDao {

    List<HashMap<String,String>> findall(User user);

}
