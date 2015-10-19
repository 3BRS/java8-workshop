package eu.keyup.workshop.java8.stream;

import eu.keyup.workshop.java8.helper.Helper;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Example22AdvancedCollector {

    public static void main(String[] args) {
        List<Integer> numbers = Helper.range(0, 100);

        long start = System.currentTimeMillis();

        Map<Integer, List<Integer>> map = numbers.stream()
                .collect(ByDivisible.create(10));

        System.out.println("TIME: " + (System.currentTimeMillis() - start) + "ms");

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    private static class ByDivisible implements Collector<
            Integer,
            Map<Integer, List<Integer>>,
            Map<Integer, List<Integer>>
            > {

        private final List<Integer> divisors;

        private ByDivisible(List<Integer> divisors) {
            this.divisors = divisors;
        }


        private static ByDivisible create(int maxDivisor) {
            return new ByDivisible(Helper.range(2, maxDivisor+1));
        }

        @Override
        public Supplier<Map<Integer, List<Integer>>> supplier() {
            return null;
        }

        @Override
        public BiConsumer<Map<Integer, List<Integer>>, Integer> accumulator() {
            return null;
        }

        @Override
        public BinaryOperator<Map<Integer, List<Integer>>> combiner() {
            return null;
        }

        @Override
        public Function<Map<Integer, List<Integer>>, Map<Integer, List<Integer>>> finisher() {
            return null;
        }

        @Override
        public Set<Characteristics> characteristics() {
            return null;
        }
    }

}
