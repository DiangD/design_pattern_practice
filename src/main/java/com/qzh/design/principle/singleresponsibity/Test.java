package com.qzh.design.principle.singleresponsibity;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/6/27
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        Bird bird = new WalkBird();
        bird.mainMoveMode("A");
    }
}
