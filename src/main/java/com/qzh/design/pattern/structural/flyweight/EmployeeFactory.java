package com.qzh.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Employeefactory
 * @Author DiangD
 * @Date 2021/1/4
 * @Version 1.0
 * @Description 享元模式的目的：减少对象的创建
 * 常见的jdk实现，Integer、Long的缓存池
 **/
public class EmployeeFactory {
    private final static Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.print("创建"+department+"部门经理\t");
            String reportContent = department.concat("部门汇报:汇报的内容为阿巴阿巴阿巴...");
            System.out.println("创建报告:"+reportContent);
            manager.setReportContent(reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
