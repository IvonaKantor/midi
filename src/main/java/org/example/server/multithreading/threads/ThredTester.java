package org.example.server.multithreading.threads;

public class ThredTester {
    public static void main(String[] args) {

        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);

        myThread.start();

        System.out.println("return to the main");
    }
}
