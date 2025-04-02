package org.example.outer_inner;

public class MyOuterClass {

    MyInnerClass inner = new MyInnerClass();

    private void doStuff() {
        inner.go();
    }

    static class MyInnerClass {
        void go() {
            System.out.println("MyInnerClass.go");
        }
    }
}
