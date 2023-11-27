package org.example.Lesson2;

public class FullStack extends Developer implements BackendAction, FrontAction{
    @Override
    public void back() {System.out.println("Backend working");

    }

    @Override
    public void front() {System.out.println("Sleep");

    }
}
