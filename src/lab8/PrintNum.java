package lab8;

public class PrintNum extends  Thread {
    public void run(){
        for (int i= 1;i<=10;i++){
            //printing numbers from 1 to 10
            System.out.println(Thread.currentThread().getName()+i);

            try {
                //sleep method it will sleep for 500 miliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        PrintNum num = new PrintNum();
        //starting thread
        num.start();
    }
}
