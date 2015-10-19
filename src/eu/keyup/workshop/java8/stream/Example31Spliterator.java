package eu.keyup.workshop.java8.stream;

import eu.keyup.workshop.java8.helper.Helper;

import java.util.List;
import java.util.Spliterator;

public class Example31Spliterator {

    public static void main(String[] args) {

        List<Integer> range = Helper.range(0, 10);

        Spliterator<Integer> spliterator = range.spliterator();

        // todo: MAIN METHODS

        // todo: tryAdvance

        // todo: forEachRemaining

        // todo: trySplit



    }


}
