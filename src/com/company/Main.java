package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш баланс");
        Bank.balance = scan.nextInt();
        Bank bankP = new Bank(Bank.balance,5,3);
        Bank bankM = new Bank(Bank.balance,5,3);
        bankM.fl=false;
        bankP.start();
        bankM.start();
        Bank.sleep(5000);
        bankP.fl=false;
        bankM.fl = true;
        bankM.join();
        System.out.println("Больше не начислять");
    }
}
