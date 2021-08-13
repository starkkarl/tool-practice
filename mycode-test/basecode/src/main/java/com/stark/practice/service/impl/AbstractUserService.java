package com.stark.practice.service.impl;

import com.stark.practice.enums.TypeEnum;
import com.stark.practice.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractUserService implements BaseService {
    @Override
    public TypeEnum getType() {
        return TypeEnum.USER_STRING;
    }

    @Override
    public String selectService(String str) {
        System.out.println(str);
        System.out.println("走到UserService了!");
        return "UserService";
    }
}
