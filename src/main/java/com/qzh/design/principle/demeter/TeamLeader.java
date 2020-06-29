package com.qzh.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TeamLeader
 * @Author DiangD
 * @Date 2020/6/27
 * @Version 1.0
 * @Description
 **/
public class TeamLeader {

    public void checkNumber() {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println(courses.size());
    }
}
