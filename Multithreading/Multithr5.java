package Multithreading;

// Multithreading using single run() method

import java.util.*;

class MYThread1 extends Thread {
    public void run() {
        String tName = Thread.currentThread().getName();
        if (tName.equals("CALCULATOR")) {
            Calc();
        }

        else {
            importantMsg();
        }

    }

    public void Calc() {
        System.out.println("Calculation task started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number");
        int num2 = sc.nextInt();

        int res = num1 + num2;
        System.out.println(res);
        System.out.println("Calculation task ended");

        System.out.println("*******************************");
    }

    public void importantMsg() {
        System.out.println("Displaying important message task started");
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println("Master skill is important");
                Thread.sleep(5000);

            }
        } catch (Exception e) {
            System.out.println("Some problem");
        }

        System.out.println("Displaying important message task ended");
    }
}

public class Multithr5 {
    public static void main(String[] args) {
        System.out.println("Main Thread");

        MYThread1 thread1 = new MYThread1();
        MYThread1 thread2 = new MYThread1();

        thread1.setName("CALCULATOR");
        thread2.setName("MESSAGE");

        thread1.start();
        thread2.start();

    }

}
