package Multithreading2;

public class practise extends Thread{
    int sum =0;
    public void run(){ synchronized(this){
        System.out.println("Child thread");
        for (int i=0;i<=12;i++){
            sum +=i;
        }
        System.out.println("notification of child thread");
        this.notify();

        this.notify();
    }

    }



    public static void main(String[] args) {
        practise pr = new practise();
        pr.start();
        synchronized (pr){
            System.out.println("Main thread is running...");
            try {
                pr.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("main thread got the notification");
            System.out.println(pr.sum);

        }


    }
}
