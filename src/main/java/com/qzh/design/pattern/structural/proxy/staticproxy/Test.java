package com.qzh.design.pattern.structural.proxy.staticproxy;

import com.qzh.design.pattern.structural.proxy.Order;
import com.qzh.design.pattern.structural.proxy.staticproxy.OrderServiceStaticProxy;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/7/7
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
