package collection;

import java.util.Iterator;
import java.util.Vector;

public class CollectionVector {
    public static void main(String[] args) {
        Vector<String> vector= new Vector<>();
        vector.add("R");
        vector.add("u");
        vector.add("c");
        vector.add("h");
        vector.add("i");
        Iterator itr = vector.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
