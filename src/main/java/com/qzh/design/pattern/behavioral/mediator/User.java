package com.qzh.design.pattern.behavioral.mediator;

/**
 * @ClassName User
 * @Author DiangD
 * @Date 2021/1/16
 * @Version 1.0
 * @Description
 **/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
