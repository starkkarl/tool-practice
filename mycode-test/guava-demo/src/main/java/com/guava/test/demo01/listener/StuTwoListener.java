package com.guava.test.demo01.listener;

import com.google.common.eventbus.Subscribe;
import com.guava.test.demo01.event.WorkEvent;

/**
 * 学生订阅事件2
 */
public class StuTwoListener {
    @Subscribe
    public void listen(WorkEvent event){
        System.out.println("学生2接收事件："+event.getMessage());
    }
    @Subscribe
    public void listen(String event){
        System.out.println("学生2接收字符串消息："+event);
    }
    @Subscribe
    public void listen(Integer event){
        System.out.println("学生2接收Integer："+event);
    }
}
