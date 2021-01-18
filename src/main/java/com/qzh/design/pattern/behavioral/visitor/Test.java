package com.qzh.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/18
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("java design pattern");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Spring action");
        codingCourse.setPrice(100);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
}
