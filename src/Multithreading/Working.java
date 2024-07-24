package Multithreading;

public class Working implements Runnable {
    public void run(){
        for (int i=0;i<10;i++){
            String work = Thread.currentThread().getName();
            System.out.println("I am "+work);
        }
    }
    public static void main(String[] args) {
        Working w = new Working();

        Thread w1 = new Thread(w);
        Thread w2 = new Thread(w);

        w1.setName("Cooking");
        w2.setName("Cleaning");

        w1.start();
        w2.start();
    }
}
