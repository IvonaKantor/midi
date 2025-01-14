package org.example.server.multithreading;

public class RunThreads implements Runnable {

    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread one = new Thread(runner);
        Thread two = new Thread(runner);
        one.setName("first");
        two.setName("second");
        one.start();
        two.start();
    }

    public void run(){
        for(int i = 0; i < 25; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
