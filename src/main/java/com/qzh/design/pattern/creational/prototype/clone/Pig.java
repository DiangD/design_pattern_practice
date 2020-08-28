package com.qzh.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @ClassName Pig
 * @Author DiangD
 * @Date 2020/8/28
 * @Version 1.0
 * @Description
 **/
public class Pig implements Cloneable {
    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        Date date = (Date) pig.getBirthday().clone();
        pig.setBirthday(date);
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
