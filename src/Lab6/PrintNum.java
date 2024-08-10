package Lab6;

public class PrintNum extends Thread{
    private int start;
    private int end;

    public PrintNum(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run(){
        synchronized (this){
            for (int i=start;i<=end;i++){
                System.out.println(Thread.currentThread().getName()+": " +i);
            }
        }
    }
    public static void main(String[] args) {
        PrintNum t1 = new PrintNum(1,20);
        PrintNum t2 = new PrintNum(21,60);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread.currentThread().setName("Thread t1");
        Thread.currentThread().setName("Thread t2");
        thread1.start();
        thread2.start();

            Thread.currentThread().setName("mainThread");
            for (int i =61;i<=80;i++){
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        try{
            thread1.join();
            thread2.join();

        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("All threads have finished their tasks.");
    }
}
