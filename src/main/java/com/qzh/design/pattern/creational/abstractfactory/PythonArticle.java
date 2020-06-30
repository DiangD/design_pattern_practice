package com.qzh.design.pattern.creational.abstractfactory;

/**
 * @ClassName PythonArticle
 * @Author DiangD
 * @Date 2020/6/30
 * @Version 1.0
 * @Description
 **/
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写python手记");
    }
}
