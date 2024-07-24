package Comparator;

        import java.util.*;
        import java.util.Comparator;
//import java.util.ArrayList;
public class sort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ruchi");
        list.add("Kalpana");
        list.add("saloni");
        list.add("himanshi");

        Comparator<String> compare = new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                char lastChar1 = i.charAt(i.length()-1);
                char lastChar2 =j.charAt(j.length()-1);
               return Character.compare(lastChar1,lastChar2);
            }
        };
        Collections.sort(list,compare);
        for (String List:list) {
            System.out.println(List);
        }
    }
}