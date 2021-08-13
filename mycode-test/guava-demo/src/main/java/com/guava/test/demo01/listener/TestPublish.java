package com.guava.test.demo01.listener;

import com.google.common.eventbus.EventBus;
import com.guava.test.demo01.event.WorkEvent;

public class TestPublish {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus("work");
        eventBus.register(new StuOneListener());
        eventBus.register(new StuTwoListener());

        eventBus.post(new WorkEvent("老师发作业数学题20道"));

        eventBus.post("英语题30道");

        eventBus.post(1);
    }
}
