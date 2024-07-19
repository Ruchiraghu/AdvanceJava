package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Mango");
        arrayList.add("Banana");
        arrayList.add("Pineapple");
        arrayList.add("Orange");
        System.out.println("Enter fruits name: ");
        System.out.println("Enter exit after entering fruits name..");
        while (true){
            String input = sc.next();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
            try{
                arrayList.add(input);
            }catch (Exception e){
                System.out.println("Incompatible type required string");
            }

        }


        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
