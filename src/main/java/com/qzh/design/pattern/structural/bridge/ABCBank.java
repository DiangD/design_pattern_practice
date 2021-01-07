package com.qzh.design.pattern.structural.bridge;

/**
 * @ClassName ABCBank
 * @Author DiangD
 * @Date 2021/1/6
 * @Version 1.0
 * @Description
 **/
public class ABCBank extends Bank{
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
