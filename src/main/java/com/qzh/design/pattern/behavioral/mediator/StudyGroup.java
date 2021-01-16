package com.qzh.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @ClassName StudyGroup
 * @Author DiangD
 * @Date 2021/1/16
 * @Version 1.0
 * @Description 中介者模式 一对多的耦合关系->一对一
 **/
public class StudyGroup {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user + "]:" + message);
    }
}
