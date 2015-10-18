package eu.keyup.workshop.java8.funcInterface;

/**
 * @author Ondřej Kratochvíl
 */
@FunctionalInterface
public interface IButton {

    // the one and only abstract method
    void click();

    // only one abstract method can be specified in @FunctionalInterface
//    void doSomethingElse();

    // however, default methods can be declared and also overridden in subclasses
    default void doSomethingDefaultly() {
        System.out.println("Yay, I did something");
    }

    // java.lang.Object methods can be overridden here (without implementation)
    String toString();
}
