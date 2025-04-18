package org.example.server.multithreading.withdrawal;

public class RyanAndMonicaJob implements Runnable {

    private final BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob job = new RyanAndMonicaJob();
        Thread one = new Thread(job);
        Thread two = new Thread(job);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    public void run() {
        for (int x = 0; x < 10; x++) {
            makeWithdrawl();
            if (account.getBalance() < 0) {
                System.out.println("Limit reached");
            }
        }
    }

    private synchronized void makeWithdrawl() {
        if (account.getBalance() >= 10) {
            System.out.println(Thread.currentThread().getName() + ": is getting to withdraw amount ");
            try {
                System.out.println(Thread.currentThread().getName() + "is going to sleep");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "woke up");
            account.withdraw(10);
            System.out.println(Thread.currentThread().getName() + "finished withdraw");
        } else {
            System.out.println("Sorry, not enough money for client: " + Thread.currentThread().getName());
        }
    }
}

















