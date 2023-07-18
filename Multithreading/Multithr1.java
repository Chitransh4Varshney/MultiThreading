package Multithreading;

// All about Main Thread

public class Multithr1 {
    public static void main(String[] args) {
        System.out.println("Main");

        System.out.println("=================================");
        System.out.println("Before change");
        String name = Thread.currentThread().getName();
        System.out.println("The name of main thread is : " + name);
        int priority = Thread.currentThread().getPriority();
        System.out.println("The priority of main thread is : " + priority);

        System.out.println("=================================");

        System.out.println("After change");
        Thread t = Thread.currentThread();
        t.setName("Chitransh");
        t.setPriority(1);
        String name1 = Thread.currentThread().getName();
        System.out.println("The change name of main thread is: " + name1);
        int priority1 = Thread.currentThread().getPriority();
        System.out.println("The change priority of thread is: " + priority1);
    }

}
