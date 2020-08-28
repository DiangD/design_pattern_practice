package com.qzh.design.pattern.structural.proxy.dynamicproxy;

import com.qzh.design.pattern.structural.proxy.IOrderService;
import com.qzh.design.pattern.structural.proxy.IOrderServiceImpl;
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
        order.setUserId(1);
        IOrderService orderServiceDynamic = (IOrderService) new OrderServiceDynamicProxy(new IOrderServiceImpl()).bind();
        orderServiceDynamic.saveOrder(order);
    }
}
