package com.qzh.design.pattern.behavioral.observer;

/**
 * @ClassName Question
 * @Author DiangD
 * @Date 2021/1/12
 * @Version 1.0
 * @Description
 **/
public class Question {
    private String username;
    private String content;

    public Question(String username, String content) {
        this.username = username;
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
