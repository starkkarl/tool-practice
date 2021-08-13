package com.guava.test.demo01.listener;

import com.google.common.eventbus.Subscribe;
import com.guava.test.demo01.event.WorkEvent;

/**
 * 学生订阅事件1
 */
public class StuOneListener {
    @Subscribe
    public void listen(WorkEvent event){
        System.out.println("学生1接收事件："+event.getMessage());
    }
    @Subscribe
    public void listen(String event){
        System.out.println("学生1接收字符串消息1："+event);
    }
    @Subscribe
    public void listen1(String event){
        System.out.println("学生1接收字符串消息2："+event);
    }
}
