package com.qzh.design.pattern.structural.flyweight;

/**
 * @ClassName Manager
 * @Author DiangD
 * @Date 2021/1/4
 * @Version 1.0
 * @Description
 **/
public class Manager implements Employee{
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(this.reportContent);
    }
}
