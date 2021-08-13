package com.stark.practice.service.impl;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends AbstractProductService {
    @Override
    public String selectService(String str) {
        System.out.println("走到了底层实现类ProductServiceImpl！！");
        return "ProductServiceImpl";
    }


}
