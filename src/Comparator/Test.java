package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList <Employee>arrayList = new ArrayList<>();
        arrayList.add(new Employee(1,"Ruchi",2300));
        arrayList.add(new Employee(3,"Priya",10000));
        arrayList.add(new Employee(2,"pooja",23330));
        for(Employee e: arrayList){
            System.out.println(e);
        }
        Collections.sort(arrayList,new IdComparator());
        System.out.println("After sorting by empId: ");
        for (Employee e:arrayList){
            System.out.println(e);
        }
    }
}
