package Practise_Thread;

public class Thread2 extends Thread{
    private int i= 0;
    public void run(){
        synchronized (this){
            for (i=11;i<=20;i++){
                System.out.println(Thread.currentThread().getName()+"Thread t2: "+i);
            }



        }
    }
}
