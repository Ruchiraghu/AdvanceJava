package Lab4;
import java.util.Scanner;

import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of fruits: ");

       while (true){
           String input = sc.next();
           if(input.equalsIgnoreCase("exit")){
               break;
           }
           String[] fruits = input.split(" ");
           for (String Fruit:fruits) {
               treeSet.add(Fruit);
           }
       }
        System.out.println(treeSet);
       sc.close();

    }
}
