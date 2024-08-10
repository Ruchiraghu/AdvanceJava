package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class collectionPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Ashish");
        queue.add("Ashutosh");
        queue.add("Ashwini");

        System.out.println("head: "+queue.element());
        System.out.println("head: "+queue.peek());
        System.out.println("Iterating elements");
        Iterator itr = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
     //   queue.remove();
        queue.poll();
        System.out.println("After removing two elements: ");
        Iterator itr1 = queue.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }

}
