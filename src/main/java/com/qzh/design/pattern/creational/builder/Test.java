package com.qzh.design.pattern.creational.builder;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/7/1
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        Coach coach = new Coach();
        coach.setCourseBuilder(new CourseActualBuilder());
        Course course = coach.makeCourse("java", "javaPPt", "javaVideo", "javaAtricle", "javaQA");
        System.out.println(course);

    }
}
