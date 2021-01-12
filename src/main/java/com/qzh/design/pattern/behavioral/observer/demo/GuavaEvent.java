package com.qzh.design.pattern.behavioral.observer.demo;

import com.google.common.eventbus.Subscribe;

/**
 * @ClassName GuavaEvent
 * @Author DiangD
 * @Date 2021/1/12
 * @Version 1.0
 * @Description
 **/
public class GuavaEvent {
    @Subscribe
    public void subscribe(String arg) {
        System.out.println("执行subscribe方法，传入参数："+arg);
    }
}
