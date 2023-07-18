package Multithreading;

// We can create thread by two ways- (1) by extending thread class (2) by implementing runable interface
// This is by extending thread class 

class MyThread extends Thread {
    public void run() {
        System.out.println("Child Thread");
    }
}

public class Multithr2 {
    public static void main(String[] args) {
        System.out.println("Main Thread");

        MyThread t = new MyThread();
        t.start();

    }

}
