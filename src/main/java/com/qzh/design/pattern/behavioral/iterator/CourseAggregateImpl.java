package com.qzh.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseAggregateImpl
 * @Author DiangD
 * @Date 2021/1/8
 * @Version 1.0
 * @Description 迭代器
 **/
public class CourseAggregateImpl implements CourseAggregate {

    private final List<Course> courses;

    public CourseAggregateImpl(List<Course> courses) {
        this.courses = courses;
    }

    public CourseAggregateImpl() {
        courses = new ArrayList<>();
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public CourseIterator<Course> getCourseIterator() {
        return new CourseIteratorImpl(courses);
    }
}
