package com.stark.practice.service.impl;

import com.stark.practice.enums.TypeEnum;
import com.stark.practice.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AbstractTest extends AbstractUserService {
    @Override
    public TypeEnum getType() {
        return TypeEnum.TEST_SERVICE;
    }

    @Override
    public String selectService(String str) {
        System.out.println("两个类继承AbstractUserService，走了AbstractTest");
        return "走了AbstractTest";
    }
}
