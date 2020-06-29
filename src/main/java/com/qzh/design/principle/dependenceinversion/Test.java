package com.qzh.design.principle.dependenceinversion;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/6/27
 * @Version 1.0
 * @Description 依赖倒转原则
 **/
public class Test {
//    //version 1
//    public static void main(String[] args) {
//        DiangD d = new DiangD();
//        d.studyJavaCourse();
//        d.studyPECourse();
//        d.studyPythonCourse();
//    }

//    //v2
//    public static void main(String[] args) {
//        DiangD d = new DiangD();
//        d.studyCourse(new javaCourse());
//    }

    //v3
    public static void main(String[] args) {
        DiangD d = new DiangD();
        d.setiCourse(new javaCourse());
        d.studyCourse();
    }
}
