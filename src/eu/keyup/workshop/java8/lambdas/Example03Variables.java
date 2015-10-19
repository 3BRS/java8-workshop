package eu.keyup.workshop.java8.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ondřej Kratochvíl
 */
public class Example03Variables {

    // captured variables
    public static void repeatMessage(int count) {
        Runnable r = () -> {
//            while (count > 0) {
//                count--;    // invalid, cannot mutate - not thread safe
//                System.out.printf("Current count is %d\n", count);
//                Thread.yield();
//            }
        };
        new Thread(r).start();
        // before Java 8, accessed variables had to be declared final
        // with Java 8, they only need to be effectively final
        // (not assigned a new value its initialization, checked by compiler (only for local variables!))
    }

    public static void repeatMessageUnsafe(List<String> list) {
        Runnable r = () -> {
            while (list.size() < 10) {
                list.add("Value");  // this is valid, but thread unsafe
            }
        };
        new Thread(r).start();
    }

    static int value = 10;

    public static void modifyInstanceVariable() {
        Runnable r = () -> {
            while (value < 20) {
                ++value;    // this is not checked
            }
        };
        new Thread(r).start();
    }
}
