package com.vea.study.blog.controller;


import com.vea.study.blog.entity.TestProduct;
import com.vea.study.blog.mapper.TestProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 枯灯少年
 * @since 2021-08-24
 */
@RestController
@RequestMapping("/blog/test-product")
public class TestProductController {
    @Autowired
    private TestProductMapper mappera;

    @GetMapping("testCodeGenerator")
    public List<TestProduct> testProducts (){
        List<TestProduct> testProducts = mappera.selectList(null);
        return testProducts;
    }
}

