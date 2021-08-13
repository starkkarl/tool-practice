package com.guava.test.demo02.controller;

import com.google.common.eventbus.AsyncEventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/event")
public class EventBusController {
    @Autowired
    private AsyncEventBus asyncEventBus;
    @GetMapping("oneTask")
    public void oneTask(HttpServletRequest request){
        System.out.println("执行第一个任务");

        //异步的，报错不影响代码顺序执行，想象成扔到队列里让他自己执行，代码继续往下
        asyncEventBus.post("测试任务！");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("接口访问完了！");
    }
}
