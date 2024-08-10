package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        List <String> list = new LinkedList<>();
        list.add("Raj");
        list.add("Ravi");
        list.add("Varun");
        list.add("Naman");
        list.add("Abhi");
        System.out.println("All elements: "+list);
        list.remove("Ravi");
        System.out.println("After removing ravi: "+list);
        LinkedList <String> list1 = new LinkedList<>();
        list1.add("vikash");
        list1.add("veeru");
        list1.add("Zatin");
        list1.add("Ravina");
        list.addAll(list1);
        System.out.println("Updated list: "+list);
        Collections.sort(list);
        System.out.println("After sorting: "+list);
        list.removeFirst();
        System.out.println("Removing first: "+list);
        System.out.println(list.removeLast()+"Remove Last: "+list);
        System.out.println("Using iterator which is interface top most interface each subclasses of collection interface implements iterable interface: ");
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
