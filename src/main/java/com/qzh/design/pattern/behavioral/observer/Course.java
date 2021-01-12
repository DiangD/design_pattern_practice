package com.qzh.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @ClassName Course
 * @Author DiangD
 * @Date 2021/1/12
 * @Version 1.0
 * @Description 被ob
 **/
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUsername()+"在"+course.getCourseName()+"提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
