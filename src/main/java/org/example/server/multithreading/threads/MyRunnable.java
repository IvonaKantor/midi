package org.example.server.multithreading.threads;

public class MyRunnable implements Runnable {
    public void run() {
        go();
    }

    public void go(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        doMore();
    }

    public void doMore(){
        System.out.println("the head of the stack");
    }
}
