package org.example;


import org.example.Lesson2.*;

public class Main {
    public static void main(String[] args) {

//        Frontender frontender= new Frontender();
//        frontender.front();
//        frontender.coffe();
//
//        Backender backender = new Backender();
//        backender.back();
//
//        FullStack fullStack= new FullStack();
//        fullStack.front();
//        fullStack.back();


        Developer dev = new Frontender();
        if (dev instanceof FrontAction){
            ((FrontAction)dev).front();
        }
    }
}