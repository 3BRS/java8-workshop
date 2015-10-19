package eu.keyup.workshop.java8.stream;

import eu.keyup.workshop.java8.helper.Helper;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Example21CreatingCollector {

    public static void main(String[] args) {
        List<Integer> numbers = Helper.range(0, 30);

        List<Integer> list = numbers.stream()
                .collect(new ToList());

        System.out.println(list);
    }

    // todo: implement and log methods

    private static class ToList implements Collector<
            Integer,
            List<Integer>,
            List<Integer>
            > {


        @Override
        public Supplier<List<Integer>> supplier() {
            return null;
        }

        @Override
        public BiConsumer<List<Integer>, Integer> accumulator() {
            return null;
        }

        @Override
        public BinaryOperator<List<Integer>> combiner() {
            return null;
        }

        @Override
        public Function<List<Integer>, List<Integer>> finisher() {
            return null;
        }

        @Override
        public Set<Characteristics> characteristics() {
            return null;
        }
    }

}
