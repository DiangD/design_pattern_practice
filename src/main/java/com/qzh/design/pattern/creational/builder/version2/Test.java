package com.qzh.design.pattern.creational.builder.version2;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/7/1
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseArticle("javaArticle")
                .buildCourseName("javaCourse")
                .build();
        System.out.println(course);
    }
}
