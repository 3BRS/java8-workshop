package eu.keyup.workshop.java8.lambdas;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example01ForEach {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Beda", "Cyril", "David");

        System.out.println("\n\nclassic iteration");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\n\nfunctional without lambda");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        System.out.println("\n\nwith lambda statement with type");
        names.forEach((String name) -> {
            System.out.println(name);
        });

        System.out.println("\n\nlambda statement");
        names.forEach(name -> {
            System.out.println(name);
        });

        System.out.println("\n\nlambda expression");
        names.forEach(name -> System.out.println(name));

        System.out.println("\n\nmethod reference");
        names.forEach(System.out::println);
    }

}
