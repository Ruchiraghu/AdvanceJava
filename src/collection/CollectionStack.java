package collection;

import java.util.Iterator;
import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("H");
        stack.push("I");
        stack.push("K");
        System.out.println("Before pop out ");
        Iterator itr = stack.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
        System.out.println();
        System.out.println("After pop");
        stack.pop();
        Iterator itr1 = stack.iterator();
        while(itr1.hasNext()){
            System.out.print(itr1.next());
        }
    }
}
