package com.guava.test.demo02.config;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.guava.test.demo02.async.EventListenerTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.EventListener;
import java.util.concurrent.*;

@Configuration
public class AsyncEventBusConfiguration {
    @Autowired
    private static Executor executor = new ThreadPoolExecutor(1, 10, 60,
            TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(100000), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

    @Resource
    private EventListenerTask eventListenerTask;
    /**
     * 异步事件单例模式
     * @return
     */
    @Bean
    public AsyncEventBus getAsyncEventBus() {
        System.out.println("------异步事件总线注册------");
        AsyncEventBus asyncEventBus = new AsyncEventBus("asyncEventBus",executor);
        asyncEventBus.register(eventListenerTask);
        return asyncEventBus;
    }


}
