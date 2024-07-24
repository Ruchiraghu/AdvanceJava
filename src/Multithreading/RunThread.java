package Multithreading;

public class RunThread implements Runnable{
    public void run(){
        for(int i =0;i<25;i++){
            String name = Thread.currentThread().getName();
            System.out.println(name+": is running ");
        }
    }

    public static void main(String[] args) {
     RunThread run = new RunThread();
     Thread t1 = new Thread(run);
     Thread t2 = new Thread(run);
     t1.setName("Dhoni Thread");
     t2.setName("Kohli Thread");

     t1.start();
     t2.start();
    }
}
