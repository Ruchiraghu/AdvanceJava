import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class Jult19_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers:  ");
        List<Integer> list = new ArrayList<>();
        while (true){
            String input = sc.next();
            if(input.equalsIgnoreCase("end")){
                break;
            }
            try{
                int num = Integer.parseInt(input);
                list.add(num);

            }catch (NumberFormatException e){
                System.out.println("Invalid input");

            }
        }
        HashSet<Integer> hashSet = new HashSet<>(list);
        List<Integer> result = new ArrayList<>(hashSet);
        System.out.println(result);
        sc.close();
    }
}
