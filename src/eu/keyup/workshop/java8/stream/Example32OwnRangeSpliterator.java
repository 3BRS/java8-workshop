package eu.keyup.workshop.java8.stream;

import eu.keyup.workshop.java8.helper.Helper;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Example32OwnRangeSpliterator {

    public static void main(String[] args) {

        // todo: create stream and print numbers

    }

    private static class RangeSpliterator implements Spliterator<Integer> {

        private int from;
        private int to;

        private RangeSpliterator(int from, int to) {
            this.from = from;
            this.to = to;
        }

        // ******************** BASIC IMPLEMENTED METHODS ********************

        // todo: implement

        @Override
        public boolean tryAdvance(Consumer<? super Integer> action) {
            return false;
        }

        @Override
        public Spliterator<Integer> trySplit() {
            return null;
        }

        @Override
        public long estimateSize() {
            return 0;
        }

        @Override
        public int characteristics() {
            return 0;
        }
    }

}
