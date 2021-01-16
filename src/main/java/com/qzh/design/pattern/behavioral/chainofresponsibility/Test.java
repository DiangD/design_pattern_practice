package com.qzh.design.pattern.behavioral.chainofresponsibility;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/16
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        Course course = new Course("juc并发编程", "has article", "has video");
        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
