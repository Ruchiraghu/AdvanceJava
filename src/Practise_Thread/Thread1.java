package Practise_Thread;

public class Thread1 extends Thread {
    private int i = 0;

    public void run() {
        synchronized (this) {
            for (i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "Thread t1: "+i);
            }
        }

    }
}