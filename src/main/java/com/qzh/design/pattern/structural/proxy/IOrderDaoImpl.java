package com.qzh.design.pattern.structural.proxy;

/**
 * @ClassName IOrderDaoImpl
 * @Author DiangD
 * @Date 2020/7/7
 * @Version 1.0
 * @Description
 **/
public class IOrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加order成功");
        return 1;
    }
}
