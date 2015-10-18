package eu.keyup.workshop.java8.lambdas;

import java.util.Comparator;

/**
 * @author Ondřej Kratochvíl
 */
public class Example02 {

    public static void main(String[] args) {
        // invalid, because result is specified only in one branch
//        Calculator c = (int x) -> { if (x >= 0) return 1;};

        // checked exceptions are still checked
//        Calculator c = x -> {
//            throw new Exception();
//        };
        // solutions: try-catch/add exception to methods declaration/use other functional interface

        // Method reference
        PowerCalculator calc1 = (x,y) -> Math.pow(x, y);
        PowerCalculator calc2 = Math::pow;

        // getting the value - old way
        double oldWay = new PowerCalculator() {
            @Override
            public double calculate(double x, double y) {
                return Math.pow(x,y);
            }
        }.calculate(1,2);

        // getting the value - new way
        double newWay = ((PowerCalculator)Math::pow).calculate(1,2);

        // this and super reference
        // toDo: think of example using this::foo() and super::foo()

        // constructor references
        // toDo: example
    }

    @FunctionalInterface
    private interface Calculator {

        int calculate(int x);
    }

    @FunctionalInterface
    private interface PowerCalculator {

        double calculate(double x, double y);
    }
}
