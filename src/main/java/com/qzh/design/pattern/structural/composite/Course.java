package com.qzh.design.pattern.structural.composite;

/**
 * @ClassName Course
 * @Author DiangD
 * @Date 2021/1/5
 * @Version 1.0
 * @Description
 **/
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:"+name+" Price:"+price);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
