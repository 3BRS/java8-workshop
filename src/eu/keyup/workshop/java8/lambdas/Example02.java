package eu.keyup.workshop.java8.lambdas;

import java.util.*;
import java.util.function.Supplier;

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
        PowerCalculator calc1 = (x, y) -> Math.pow(x, y);
        PowerCalculator calc2 = Math::pow;

        // getting the value - old way
        double oldWay = new PowerCalculator() {
            @Override
            public double calculate(double x, double y) {
                return Math.pow(x, y);
            }
        }.calculate(1, 2);

        // getting the value - new way
        double newWay = ((PowerCalculator) Math::pow).calculate(1, 2);

        // constructor reference
        List<String> list = Arrays.asList("one", "two");
        // notice type inference when introducing local variable
        LinkedList<String> linkedCopy = transferElements(list, () -> new LinkedList<>());

        // the same with constructor ref (notice that no type is specified, above would return error without diamond)
        LinkedList<String> nicerLinkedCopy = transferElements(list, LinkedList::new);
        // analogically using this::foo() and super::foo()
    }

    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
    DEST transferElements(SOURCE sourceCollection, Supplier<DEST> collectionFactory) {

        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
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
