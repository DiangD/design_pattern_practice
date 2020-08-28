package com.qzh.design.pattern.structural.proxy.staticproxy;

import com.qzh.design.pattern.structural.proxy.IOrderService;
import com.qzh.design.pattern.structural.proxy.IOrderServiceImpl;
import com.qzh.design.pattern.structural.proxy.Order;
import com.qzh.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @ClassName OrderServiceStaticProxy
 * @Author DiangD
 * @Date 2020/7/7
 * @Version 1.0
 * @Description order service的静态代理
 **/
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new IOrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        System.out.println("静态代理 before code");
        int userId = order.getUserId();
        String dbRouter = "db"+(userId % 2);
        System.out.println("静态代理分配到【" + dbRouter + "】");
        DataSourceContextHolder.setDBType(dbRouter);
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
