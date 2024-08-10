package TreeSet;

import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet <String> input = new TreeSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fruits names: ");
//        input.add("banana");
//        input.add("orange");
//        input.add("apple");

        while(true){
          String in = sc.next();

          if(in.equalsIgnoreCase("exit")){
              break;
          }
          String [] fruits = in.split(" ");
          for(String fruit: fruits){
              input.add(fruit);
          }
        }

        System.out.println(input);
        sc.close();

    }

}
