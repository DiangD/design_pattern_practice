package com.qzh.design.pattern.structural.composite;

/**
 * @ClassName CatalogComponent
 * @Author DiangD
 * @Date 2021/1/5
 * @Version 1.0
 * @Description 统一的接口实现或抽象父类
 **/
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }
    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }
    public String getName(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }
    public double getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }
    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
