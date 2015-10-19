package eu.keyup.workshop.java8.optional;

import java.util.Optional;

/**
 * @author Ondřej Kratochvíl
 */
public class Example01 {

    public static void main(String[] args) {
        Integer intNull = null;
        Integer intVal = 1;

//        Optional<Integer> o1 = Optional.of(intNull); // not this way - causes NPE (checked by compiler)
        Optional<Integer> o2 = Optional.ofNullable(intNull);    // returns a static final instance of Optional.empty()
//        System.out.println(o2.get());   // throws NoSuchElementException

        // ineffective way
        if (o2.isPresent()) {
            System.out.println("[#isPresent()]o2 value is: " + o2.get());
        } else {
            System.out.println("[#isPresent()]o2 is empty.");
        }

        // more effective way
        Optional<Integer> o3 = Optional.of(intVal);
//        o2.ifPresent(integer -> System.out.println("[#ifPresent()]o2 value is: " + integer));
//        o3.ifPresent(integer -> System.out.println("[#ifPresent()]o3 value is: " + integer));

//        System.out.println("[#orElseGet()]o2 value is: " + o2.orElseGet(() -> Integer.MIN_VALUE));
//        System.out.println("[#orElseGet()]o3 value is: " + o3.orElseGet(() -> Integer.MIN_VALUE));
        // analogically orElseThrow
    }
}
