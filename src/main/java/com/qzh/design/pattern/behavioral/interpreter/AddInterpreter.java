package com.qzh.design.pattern.behavioral.interpreter;

/**
 * @ClassName AddInterpreter
 * @Author DiangD
 * @Date 2021/1/12
 * @Version 1.0
 * @Description
 **/
public class AddInterpreter implements Interpreter{
    private final Interpreter first;
    private final Interpreter second;

    @Override
    public int interpret() {
        return first.interpret()+ second.interpret();
    }

    public AddInterpreter(Interpreter first, Interpreter second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "AddInterpreter{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
