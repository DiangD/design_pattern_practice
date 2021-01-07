package com.qzh.design.pattern.structural.bridge;

/**
 * @ClassName ICBCBank
 * @Author DiangD
 * @Date 2021/1/6
 * @Version 1.0
 * @Description
 **/
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
