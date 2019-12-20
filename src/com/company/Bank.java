package com.company;

public class Bank extends Thread {
    public boolean fl = true;
    public static int balance;
    private int minus,plus;
    Bank(int b,int pl,int min){
        this.balance = b;
        this.minus = min;
        this.plus = pl;
    }
    public void run() {
        while(fl){
            this.balance+=plus;
            System.out.println("Ваш баланс после начисления:" +balance);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while(fl==false) {
            if (balance >= minus) {
                this.balance -= minus;
                System.out.println("Ваш баланс после снятия:" + balance);
            } else {
                System.out.println("Вы не можете снять столько денег");
                this.balance = 0;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
