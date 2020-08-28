package com.qzh.design.pattern.creational.prototype;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2020/8/28
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < 10; i++) {
            Mail tmp = (Mail) mail.clone();
            mail.setName("姓名"+i);
            mail.setEmailAddress("姓名"+i+"@qq.com");
            mail.setContent("恭喜你，中奖了！");
            MailUtil.sendMail(tmp);
        }
        MailUtil.saveOriginMail(mail);
    }
}
