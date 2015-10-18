package eu.keyup.workshop.java8.funcInterface;

/**
 * @author Ondřej Kratochvíl
 */
// this is not a functional interface!
//@FunctionalInterface
public interface DraggableButton extends IButton, Draggable {

    // or is it?
//    default void onDrag() {
//
//    }
}
