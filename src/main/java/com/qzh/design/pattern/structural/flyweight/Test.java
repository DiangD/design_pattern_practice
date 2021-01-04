package com.qzh.design.pattern.structural.flyweight;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/4
 * @Version 1.0
 * @Description
 **/
public class Test {
    private static final String[] departments = {"RD", "HR","QA","PM"};
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Employee manager = EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
