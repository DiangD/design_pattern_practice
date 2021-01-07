package com.qzh.design.pattern.structural.bridge;

/**
 * @ClassName SavingAccount
 * @Author DiangD
 * @Date 2021/1/6
 * @Version 1.0
 * @Description 具体实现
 **/
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }

}
