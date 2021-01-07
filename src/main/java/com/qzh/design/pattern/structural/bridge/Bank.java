package com.qzh.design.pattern.structural.bridge;

/**
 * @ClassName Bank
 * @Author DiangD
 * @Date 2021/1/6
 * @Version 1.0
 * @Description 抽象 桥接模式参考jdk Driver DriverInfo DriverManager
 **/
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
