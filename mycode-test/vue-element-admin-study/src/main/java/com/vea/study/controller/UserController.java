package com.vea.study.controller;

import com.vea.study.entity.UserEntity;
import com.vea.study.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public List<UserEntity> findAll(){
        // 参数是一个Wrapper，条件构造器，这里我们先不用null
        // 查询全部用户
        List<UserEntity> users = userMapper.selectList(null);
        users.forEach(System.out::println);
        return users;
    }

}
