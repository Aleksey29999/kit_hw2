package org.example.Lesson2;

public interface FrontAction {
    void front();
    default void coffe() {
        System.out.println("Drink");
    };
}
