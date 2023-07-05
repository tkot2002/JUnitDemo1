package org.example;
import java.util.stream.DoubleStream;

public class Calculator {
    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    static int factorial(int i) {
        int result = 1;
        if (i <= 0) {
            result = 0;
        }
        else {
            for (int num = i; num > 1; num--) {
                result *= num;
            }
        }
        return result;
    }
}
