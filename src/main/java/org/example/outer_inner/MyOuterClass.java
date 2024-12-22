package org.example;

public class MyOuterClass {

    private int x;
    MyIneerClass inner = new MyIneerClass();

    public void doStuff(){
        inner.go();
    }
    
    class MyIneerClass{
        void go(){
            x = 42;
        }
    }
}
