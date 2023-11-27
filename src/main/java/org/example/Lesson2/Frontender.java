package org.example.Lesson2;

public class Frontender extends Developer implements FrontAction{
    @Override
    public void front() {
        System.out.println("Sleep");
    }
    @Override
    public void coffe() {
        System.out.println("cofe");
    }
}
