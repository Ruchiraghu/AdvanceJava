package Multithreading2;

public class MyThread extends Thread{
    int num =0;

    public void run(){
        synchronized (this){
            System.out.println("Child thread");
            for (int i =0;i<=10;i++){
                num= num+i;
            }
            System.out.println("Child thread giving notification!!");
            this.notify();
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        synchronized (mt){
            System.out.println("Main thread call");
            try { System.out.println("waiting");
                mt.wait();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("main thread got the notification....");
            System.out.println(mt.num);
        }
    }
}
