package com.qzh.design.principle.singleresponsibity;

/**
 * @ClassName WalkBird
 * @Author DiangD
 * @Date 2020/6/27
 * @Version 1.0
 * @Description
 **/
public class WalkBird extends Bird {
    @Override
    public void mainMoveMode(String birdName) {
        System.out.println(birdName+"walk by feet");
    }
}
