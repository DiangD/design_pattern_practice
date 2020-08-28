package com.qzh.design.pattern.structural.proxy.dynamicproxy;

import com.qzh.design.pattern.structural.proxy.Order;
import com.qzh.design.pattern.structural.proxy.db.DataSourceContextHolder;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName OrderServiceDynamicProxy
 * @Author DiangD
 * @Date 2020/7/7
 * @Version 1.0
 * @Description 动态代理
 **/
public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    private void beforeMethod(Object object) {
        int userId = 0;
        System.out.println("动态代理 before code");
        if (object instanceof Order) {
            Order order = (Order) object;
            userId = order.getUserId();
        }
        String dbRouter = "db"+(userId % 2);
        System.out.println("动态代理分配到【" + dbRouter + "】");
        DataSourceContextHolder.setDBType(dbRouter);
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObj = args[0];
        beforeMethod(argObj);
        Object invoke = method.invoke(target, args);
        afterMethod();
        return invoke;
    }
}
