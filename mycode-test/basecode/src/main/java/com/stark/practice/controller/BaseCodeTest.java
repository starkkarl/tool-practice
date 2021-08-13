package com.stark.practice.controller;

import com.stark.practice.entity.BaseEntity;
import com.stark.practice.enums.TypeEnum;
import com.stark.practice.service.BaseService;
import com.stark.practice.service.InitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping("/baseCode")
public class BaseCodeTest {

    @Autowired
    InitServiceImpl initServiceImpl;

    @GetMapping("testService/{no}")
    public String testService(@PathVariable String no){
        String str = initServiceImpl.testService(no);
        return str;
    }

    @GetMapping("testIterator")
    public List<BaseEntity> testIterator() {
        List<BaseEntity> list = new ArrayList<>();
        BaseEntity baseEntity1 = new BaseEntity("a", 1);
        BaseEntity baseEntity2 = new BaseEntity("b", 2);
        BaseEntity baseEntity3 = new BaseEntity("c", 3);
        list.add(baseEntity1);
        list.add(baseEntity2);
        list.add(baseEntity3);

        long start = System.currentTimeMillis();
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            BaseEntity baseEntity = (BaseEntity) iterator.next();
            System.out.println("-------------" + baseEntity.getAge());
        }
        long end = System.currentTimeMillis();
        System.out.println("迭代器遍历时间:" + (end - start));

        long start1 = System.currentTimeMillis();
        list.stream().forEach((baseEntity) -> {
            System.out.println("++++++++++" + baseEntity.getAge());
        });
        long end1 = System.currentTimeMillis();
        System.out.println("stream遍历时间:" + (end1 - start1));

        List<BaseEntity> list1 = new ArrayList<>();
        list1.addAll(list);
        return list;
    }

    public static void main1(String[] args) {
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setAge(12);
        baseEntity.setName("asd");
        if (baseEntity instanceof BaseEntity) {

        }
    }

    public static void main2(String[] args) {
        BaseEntity a1 = new BaseEntity("a", 1);
        BaseEntity a2 = new BaseEntity("b", 2);
        BaseEntity a3 = new BaseEntity("c", 3);
        BaseEntity a4 = new BaseEntity("d", 4);
        List<BaseEntity> objects = new ArrayList<>();
        objects.add(a1);
        objects.add(a2);
        objects.add(a3);
        objects.add(a4);

        objects.stream().forEach(System.out::println);
    }

    public static void main3(String[] args) {
        int a = 11;
        int b = 11;
        int c = 12;

        if (a == b || a == c && b == c) {
            System.out.println("左->右");
        }
        if (a == b || a == c) {
            System.out.println("左->右1");
        }
    }

    public static void main4(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("xiaocui1", "gongchen");
        map.put("xiaocui2", "daima");
        map.put("xiaocui3", "xuexi");
        map.put("xiaocui4", "dagong");

        System.out.println(map.keySet());

        System.out.println("-----分割线-----");
        for (String map1 : map.keySet()) {
            String string = map.keySet().toString();
            System.out.println(string);
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("asd");
        list.add("asasdf");
        list.add("asdqwr");
        System.out.println(list);
    }
}
