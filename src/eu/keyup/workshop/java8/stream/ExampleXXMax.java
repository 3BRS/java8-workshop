package eu.keyup.workshop.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ExampleXXMax {

    public static void main(String[] args) {
        // maximum
        List<Integer> numbers = Arrays.asList(5, 8, 2, 4, 6, 4, 7, 1, 7);

        printMax(declarativeMax(numbers));
        printMax(functionalMax(numbers).get());

        // empty with default value
        numbers = Collections.emptyList();

        Integer max = declarativeMax(numbers);
        if (max == null) {
            max = Integer.MIN_VALUE;
        }
        printMax(max);

        printMax(functionalMax(numbers).orElse(Integer.MIN_VALUE));

        // with exception if empty
        numbers = Collections.singletonList(1);

        max = declarativeMax(numbers);
        if (max == null) {
            throw new IllegalStateException("No numbers given");
        }
        printMax(max);

        printMax(functionalMax(numbers).orElseThrow(() -> new IllegalStateException("No numbers given")));
    }

    private static Integer declarativeMax(Iterable<Integer> numbers) {
        Integer max = null;
        for (Integer number : numbers) {
            if (max == null || number > max) {
                max = number;
            }
        }
        return max;
    }

    private static Optional<Integer> functionalMax(Collection<Integer> numbers) {
        return numbers.stream().reduce((n1, n2) -> n1 > n2 ? n1 : n2);
    }

    private static void printMax(Integer max) {
        System.out.println("Max: " + max);
    }
}
