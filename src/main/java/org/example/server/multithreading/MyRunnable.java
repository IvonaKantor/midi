package org.example.server.multithreading;

public class MyRunnable implements Runnable {
    public void run() {
        go();
    }

    public void go(){
        doMore();
    }

    public void doMore(){
        System.out.println("the head of the stack");
    }
}
