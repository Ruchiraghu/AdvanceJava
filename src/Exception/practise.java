package Exception;

public class practise {

    static void run(){
        System.out.println("Running, iteration: "+(counter+1));
    }
   static int counter =0;
    public static void main(String[] args) {
//        while (counter<10){
//            run();
//            counter++;
//        }

        for (int i=0;i<10;i++){

            int count = i+1;
            System.out.println("Running iteration: "+count);
        }
    }
}
