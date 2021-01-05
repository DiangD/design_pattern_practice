package com.qzh.design.pattern.structural.composite;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/5
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("Windows课程",11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);

        CatalogComponent course1 = new Course("Java基础一期",55);
        CatalogComponent course2 = new Course("Java基础二期",66);
        CatalogComponent designPattern = new Course("Java设计模式",77);

        javaCourseCatalog.add(course1);
        javaCourseCatalog.add(course2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent mainCourseCatalog = new CourseCatalog("课程主目录",1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();
    }
}
