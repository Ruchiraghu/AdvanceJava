package distinctElement;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static void main(String[] args) {
        int[] array = {1,2,22,2,2,3,4,5,5,2,3,10};

        Set<Integer> distinct = new HashSet<>();
        for(int num:array){
            distinct.add(num);
        }
        System.out.println("Distinct elements are: ");
        for(int num: distinct){
            System.out.println(num+" ");
        }
    }
}
