package com.qzh.design.pattern.behavioral.interpreter;

/**
 * @ClassName Test
 * @Author DiangD
 * @Date 2021/1/12
 * @Version 1.0
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        String input = "6 100 11 + *";
        CustomInterpreterParser parser = new CustomInterpreterParser();
        int parse = parser.parse(input);
        System.out.println("result:"+ parse);
    }
}
