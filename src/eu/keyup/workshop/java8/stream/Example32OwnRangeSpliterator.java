package eu.keyup.workshop.java8.stream;

import eu.keyup.workshop.java8.helper.Helper;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Example32OwnRangeSpliterator {

    public static void main(String[] args) {

        List<Integer> list = StreamSupport.stream(new RangeSpliterator(0, 20), true)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    private static class RangeSpliterator implements Spliterator<Integer> {

        private int from;
        private int to;
        private int cursor;

        private RangeSpliterator(int from, int to) {
            this.from = from;
            this.to = to;
            cursor = from;
        }

        // ******************** BASIC IMPLEMENTED METHODS ********************


        @Override
        public boolean tryAdvance(Consumer<? super Integer> action) {
            action.accept(cursor);
            cursor ++;
            return cursor < to;
        }

        @Override
        public Spliterator<Integer> trySplit() {
            int diff = (to - cursor) / 2;
            if (diff > 5) {
                int prevCursor = cursor;
                cursor += diff;
                return new RangeSpliterator(prevCursor, cursor);
            } else {
                return null;
            }
        }

        @Override
        public long estimateSize() {
            return to - from;
        }

        @Override
        public int characteristics() {
            return ORDERED | DISTINCT;
        }
    }

}
