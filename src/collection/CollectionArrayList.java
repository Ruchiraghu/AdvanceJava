package collection;
import java.util.*;
public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Nisha");
        arrayList.add("preeti");
        arrayList.add("rishee");
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        ArrayList<String> newElements = new ArrayList<String>();
        newElements.add("Aman");
        newElements.add("Ravi");
        CollectionArrayList collectionArrayList = new CollectionArrayList();
        System.out.println("After adding new elements");
        itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        newElements.addAll(arrayList);
        System.out.println(newElements);
    }

}
