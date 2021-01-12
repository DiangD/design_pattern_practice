package com.qzh.design.pattern.behavioral.interpreter;

/**
 * @ClassName NumberInterpreter
 * @Author DiangD
 * @Date 2021/1/12
 * @Version 1.0
 * @Description
 **/
public class NumberInterpreter implements Interpreter{
    private final int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String num) {
        this.number = Integer.parseInt(num);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
