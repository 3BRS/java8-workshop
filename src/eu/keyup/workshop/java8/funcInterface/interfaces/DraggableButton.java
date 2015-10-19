package eu.keyup.workshop.java8.funcInterface.interfaces;

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
