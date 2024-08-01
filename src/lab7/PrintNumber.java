package lab7;

public class PrintNumber extends Thread{

    public void run(){
        for(int i =0;i<=4;i++){
            //this will print number from 0 to 4
            System.out.println("Thread- "+i);
        }
    }

    public static void main(String[] args) {
        //main method
        PrintNumber num = new PrintNumber();
        num.start();
    }
}
