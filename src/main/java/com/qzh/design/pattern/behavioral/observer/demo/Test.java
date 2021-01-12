package com.qzh.design.pattern.behavioral.observer.demo;

import com.google.common.eventbus.EventBus;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/12
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        EventBus bus = new EventBus();
        GuavaEvent event = new GuavaEvent();
        bus.register(event);
        bus.post("test");

    }
}
