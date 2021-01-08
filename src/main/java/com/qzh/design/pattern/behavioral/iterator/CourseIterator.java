package com.qzh.design.pattern.behavioral.iterator;

/**
 * @ClassName CourseIterator
 * @Author DiangD
 * @Date 2021/1/8
 * @Version 1.0
 * @Description
 **/
public interface CourseIterator<E> {
    E nextCourse();

    boolean isLastCourse();
}
