package com.qzh.design.pattern.behavioral.mediator;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/16
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        User user1 = new User("qzh");
        User user2 = new User("trump");

        user1.sendMessage("hi trump");
        user2.sendMessage("hi qzh");
    }
}
