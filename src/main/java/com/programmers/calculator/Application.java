package com.programmers.calculator;

import com.programmers.calculator.engine.Calculator;

public class Application {
    public static void main(String[] args) {
        Console console = new Console();
        new Calculator(console, console).run();
    }
}
