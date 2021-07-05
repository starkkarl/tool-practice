package com.stark.practice.controller;

import com.stark.practice.entity.BaseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/baseCode")
public class BaseCodeTest {

    @GetMapping("testIterator")
    public List<BaseEntity> testIterator(){
        List<BaseEntity> list = new ArrayList<>();
        BaseEntity baseEntity1 = new BaseEntity("a",1);
        BaseEntity baseEntity2 = new BaseEntity("b",2);
        BaseEntity baseEntity3 = new BaseEntity("c",3);
        list.add(baseEntity1);
        list.add(baseEntity2);
        list.add(baseEntity3);

        long start = System.currentTimeMillis();
        for (Iterator iterator = list.iterator();iterator.hasNext();){
            BaseEntity baseEntity = (BaseEntity) iterator.next();
            System.out.println("-------------"+baseEntity.getAge());
        }
        long end = System.currentTimeMillis();
        System.out.println("迭代器遍历时间:"+(end-start));

        long start1 = System.currentTimeMillis();
        list.stream().forEach((baseEntity)->{
            System.out.println("++++++++++"+baseEntity.getAge());
        });
        long end1 = System.currentTimeMillis();
        System.out.println("stream遍历时间:"+(end1-start1));

        List<BaseEntity> list1 = new ArrayList<>();
        list1.addAll(list);
        return list;
    }

}
