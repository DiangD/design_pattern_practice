package com.qzh.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Teacher
 * @Author DiangD
 * @Date 2021/1/12
 * @Version 1.0
 * @Description ob 利用jdk提供的接口实现同步的监听
 * 注册被监听的object=>setChange、notify=> update
 **/
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(name + "老师的" + course.getCourseName()
                + "收到一个" + question.getUsername()
                + "提交的问题：" + question.getContent());
    }
}
