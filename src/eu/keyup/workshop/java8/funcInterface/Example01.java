package eu.keyup.workshop.java8.funcInterface;

/**
 * @author Ondřej Kratochvíl
 */
public class Example01 {

    public static void main(String[] args) {
        Draggable d = () -> {
            System.out.println("Dragged");
            System.out.println("Second line");
        };
        d.onDrag();

        ValueHolder v = () -> {
            System.out.println("getValue was called");
            return 7;
        };
        System.out.println(v.getValue());

//        Draggable exceptional = () -> {
//            throw new RuntimeException();
//        };
//        exceptional.onDrag();
    }
}
