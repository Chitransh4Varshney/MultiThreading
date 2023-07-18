package Multithreading;

//Dead Lock condition

class Library implements Runnable {
    String res1 = new String("JAVA");
    String res2 = new String("SQL");
    String res3 = new String("DSA");

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("STUDENT-1")) {
            try {
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("Student 1 has acc " + res1);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("Student 1 has acc " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {
                            System.out.println("Student 1 has acc " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            }

            catch (Exception e) {
                System.out.println("Some problem");
            }
        }

        else {
            try {
                Thread.sleep(3000);
                synchronized (res3) {
                    System.out.println("Student 2 has acc " + res3);
                    Thread.sleep(3000);
                    synchronized (res2) {
                        System.out.println("Student 2 has acc " + res2);
                        Thread.sleep(3000);
                        synchronized (res1) {
                            System.out.println("Student 2 has acc " + res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            }

            catch (Exception e) {
                System.out.println("Some problem");
            }
        }
    }

}

public class Multithr9Deadlock {
    public static void main(String[] args) {

        Library li = new Library();

        Thread t1 = new Thread(li);
        Thread t2 = new Thread(li);

        t1.setName("STUDENT-1");
        t2.setName("STUDENT-2");

        t1.start();
        t2.start();

    }

}
