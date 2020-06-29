package com.qzh.design.principle.openclose;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/6/27
 * @Version 1.0
 * @Description 开闭原则
 **/
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountPrice(1, "java从0开始企业级电商开发", 348d);
        JavaDiscountPrice javaCourse = (JavaDiscountPrice) iCourse;
        System.out.println("id" + javaCourse.getId() + "  name" + javaCourse.getName()
                + "  price" + javaCourse.getPrice() + "  origin" + javaCourse.getOriginalPrice());
    }
}
