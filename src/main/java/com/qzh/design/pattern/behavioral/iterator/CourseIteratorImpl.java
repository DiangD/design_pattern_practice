package com.qzh.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @ClassName CourseIteratorImpl
 * @Author DiangD
 * @Date 2021/1/8
 * @Version 1.0
 * @Description
 **/
public class CourseIteratorImpl implements CourseIterator<Course> {
    private final List<Course> courses;
    private int position;

    public CourseIteratorImpl(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public Course nextCourse() {
        Course course = courses.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        return position == courses.size();
    }
}
