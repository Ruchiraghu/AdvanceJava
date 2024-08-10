package Practise_Thread;

public class Main {
    public static void main(String[] args) {
        Thread1  t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        t1.setName("t1");
        t2.setName("t2");
        try {
            t1.join();//allow one thread to wait until another thread complete its execution
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
