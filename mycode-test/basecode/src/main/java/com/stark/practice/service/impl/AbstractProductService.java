package com.stark.practice.service.impl;

import com.stark.practice.enums.TypeEnum;
import com.stark.practice.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractProductService implements BaseService {
    @Override
    public TypeEnum getType() {
        System.out.println("????啥时候调的");
        return TypeEnum.PRODUCT_SERVICE;
    }

    /*@Override
    public String selectService(String str) {
        System.out.println(str);
        System.out.println("走到ProductService了！");
        return "ProductService";
    }*/

}
