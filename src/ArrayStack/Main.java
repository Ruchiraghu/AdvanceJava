package ArrayStack;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(2);
        stack.push(41);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(9);



        System.out.println("Top: "+stack.peek());
        System.out.println("Size: "+stack.size());
        //pop
        System.out.println(".....After popping.....");
        System.out.println("pop: "+stack.pop());
        System.out.println("Top: "+stack.peek());
        System.out.println("Now Size is: "+stack.size());

        System.out.println("Is empty: "+stack.isEmpty());
        stack.printAllElements();



    }
}
