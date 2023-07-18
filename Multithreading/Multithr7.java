package Multithreading;

//join() And isAlive() Methods

class Print implements Runnable {
    public void run() {
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println("All is well........");
                Thread.sleep(3000);
            }
        }

        catch (Exception e) {
            System.out.println("Some problem");
        }
    }
}

public class Multithr7 {
    public static void main(String[] args) throws Exception {

        System.out.println("Main Thread started");

        Print p = new Print();

        Thread t = new Thread(p);
        System.out.println(t.isAlive());// False

        t.start();
        System.out.println(t.isAlive());// True
        t.join();

        System.out.println("Main Thread Ended");

    }

}
