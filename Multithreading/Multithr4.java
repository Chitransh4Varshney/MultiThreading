package Multithreading;

// 1) by implementing runnable interface

import java.util.*;

class calc implements Runnable {
    public void run() {
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
}

class Message implements Runnable {
    public void run() {
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

public class Multithr4 {
    public static void main(String[] args) {
        System.out.println("Main Thread");

        calc c1 = new calc();

        Message c2 = new Message();

        Thread t1 = new Thread(c1);

        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();

    }

}
