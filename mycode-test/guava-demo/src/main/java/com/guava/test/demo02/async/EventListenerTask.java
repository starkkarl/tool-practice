package com.guava.test.demo02.async;

import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventListenerTask {

    @Subscribe
    public void OneTask(String event){
        System.out.println("故意报错了！");
        int i = 10/0;

        System.out.println("第一个任务执行前先睡3秒！");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("睡完了，执行任务！");
        System.out.println("-----event-----"+event);
    }

    @Subscribe
    public void OneTask(List<String> list){
        System.out.println("集合输出");
        System.out.println("list:"+list);
    }
}
