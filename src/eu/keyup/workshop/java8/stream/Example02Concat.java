package eu.keyup.workshop.java8.stream;

import eu.keyup.workshop.java8.helper.Helper;

import java.util.List;

public class Example02Concat {

    public static void main(String[] args) {
        List<Integer> numbers = Helper.range(0, 10);

        String str = null;
        for (Integer number : numbers) {
            if (str == null) {
                str = number.toString();
            } else {
                str += ", " + number;
            }
        }
        System.out.println(str);

        // todo: java8
    }

}
