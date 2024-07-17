package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Riya");
        linkedList.add("shiva");
        Iterator itr = linkedList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
