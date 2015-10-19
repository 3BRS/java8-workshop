package eu.keyup.workshop.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Example01Max {

    public static void main(String[] args) {
        // maximum
        List<Integer> numbers = Arrays.asList(5, 8, 2, 4, 6, 4, 7, 1, 7);

        printMax(declarativeMax(numbers));
        // todo

        // empty with default value
        numbers = Collections.emptyList();

        Integer max = declarativeMax(numbers);
        if (max == null) {
            max = Integer.MIN_VALUE;
        }
        printMax(max);

        // todo

        // with exception if empty
        numbers = Collections.singletonList(1);

        max = declarativeMax(numbers);
        if (max == null) {
            throw new IllegalStateException("No numbers given");
        }
        printMax(max);

        // todo
    }

    // todo: functional max

    private static Integer declarativeMax(Iterable<Integer> numbers) {
        Integer max = null;
        for (Integer number : numbers) {
            if (max == null || number > max) {
                max = number;
            }
        }
        return max;
    }

    private static void printMax(Integer max) {
        System.out.println("Max: " + max);
    }
}
