package com.qzh.design.pattern.creational.abstractfactory;

/**
 * @ClassName JavaArticle
 * @Author DiangD
 * @Date 2020/6/30
 * @Version 1.0
 * @Description
 **/
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写java手记");
    }
}
