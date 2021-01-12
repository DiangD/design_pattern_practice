package com.qzh.design.pattern.behavioral.interpreter;

/**
 * @ClassName MultiInterpreter
 * @Author DiangD
 * @Date 2021/1/12
 * @Version 1.0
 * @Description
 **/
public class MultiInterpreter implements Interpreter{
    private final Interpreter first;
    private final Interpreter second;

    public MultiInterpreter(Interpreter first, Interpreter second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int interpret() {
        return first.interpret()* second.interpret();
    }

    @Override
    public String toString() {
        return "MultiInterpreter{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
