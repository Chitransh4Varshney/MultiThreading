package Multithreading;

// interrupt() method

class Source implements Runnable {
    public void run() {

        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println("All is Well..................");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Some Problem");
        }
    }
}

public class Multithr8 {
    public static void main(String[] args) {

        Source s = new Source();

        Thread t1 = new Thread(s);

        t1.start();
        t1.interrupt();

    }

}
