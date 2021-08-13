package com.guava.test.demo01.event;

/**
 * 发布作业的事件
 */
public class WorkEvent {
    private String message;

    public WorkEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
