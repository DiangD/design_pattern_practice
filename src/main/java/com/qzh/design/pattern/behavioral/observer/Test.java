package com.qzh.design.pattern.behavioral.observer;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/12
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher = new Teacher("Teacher Wu");
        course.addObserver(teacher);

        String username = "Student Zuo";
        String content = "如何编写观察者设计模式？";
        Question question = new Question(username,content);
        course.produceQuestion(course, question);
    }
}
