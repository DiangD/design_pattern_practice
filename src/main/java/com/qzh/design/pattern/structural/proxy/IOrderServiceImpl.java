package com.qzh.design.pattern.structural.proxy;

/**
 * @ClassName IOrderServiceImpl
 * @Author DiangD
 * @Date 2020/7/7
 * @Version 1.0
 * @Description
 **/
public class IOrderServiceImpl implements IOrderService {
    IOrderDao orderDao = new IOrderDaoImpl();

    @Override
    public int saveOrder(Order order) {
        System.out.println("service调用dao成功");
        orderDao.insert(order);
        return 0;
    }
}
