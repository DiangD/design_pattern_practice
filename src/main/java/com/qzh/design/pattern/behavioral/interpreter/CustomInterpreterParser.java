package com.qzh.design.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * @ClassName CustomInterpreterParser
 * @Author DiangD
 * @Date 2021/1/12
 * @Version 1.0
 * @Description
 **/
public class CustomInterpreterParser {
    private final Stack<Interpreter> stack = new Stack<>();

    public int parse(String str) {
        for (String symbol : str.split(" ")) {
            if (!OperatorUtil.isOperator(symbol)) {
                Interpreter numberInterpreter = new NumberInterpreter(symbol);
                stack.push(numberInterpreter);
                System.out.printf("push to stack:%d\n", numberInterpreter.interpret());
            }else {
                Interpreter first = stack.pop();
                Interpreter second = stack.pop();
                System.out.printf("pop from stack:%d and %d\n", first.interpret(), second.interpret());
                Interpreter expressionObject = OperatorUtil.getExpressionObject(first, second, symbol);
                if (expressionObject == null) {
                    break;
                }
                System.out.printf("use the operator %s\n", expressionObject.interpret());
                int result = expressionObject.interpret();
                NumberInterpreter numberInterpreter = new NumberInterpreter(result);
                stack.push(numberInterpreter);
                System.out.printf("calculation results push to stack:%d\n",numberInterpreter.interpret());
            }
        }
        return stack.pop().interpret();
    }
}

class OperatorUtil{
    static boolean isOperator(String symbol) {
        return symbol.equals("*") || symbol.equals("+");
    }

    static Interpreter getExpressionObject(Interpreter first, Interpreter second, String symbol) {
        switch (symbol) {
            case "*":
                return new MultiInterpreter(first, second);
            case "+":
                return new AddInterpreter(first, second);
        }
        return null;
    }
}
