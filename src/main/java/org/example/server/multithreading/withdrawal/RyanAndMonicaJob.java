package org.example.server.multithreading.withdrawal;

public class RyanAndMonicaJob implements Runnable {

    private BankAccount account = new BankAccount();

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
        for(int x = 0; x < 10; x++) {
            makeWithdrawl(10);
            if(account.getBalance() < 0){
                System.out.println("Limit reached");
            }
        }
    }

    private void makeWithdrawl(int amount) {
        if(account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + ": is getting to withdraw amount ");
            try{
                System.out.println(Thread.currentThread().getName() + "is going to sleep");
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "woke up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + "finished withdraw");
        }else{
            System.out.println("Sorry, not enough money for client: " + Thread.currentThread().getName());
        }
    }
}

















