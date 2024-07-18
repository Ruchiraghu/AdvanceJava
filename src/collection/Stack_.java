package collection;

import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();
        stack.add("Aryan");
        stack.add("Riyaz");
        stack.add("Rashi");
        stack.add("Rivana");
        stack.stream().forEach(System.out::println);
        //System.out.println(stack.stream().peek(System.out::println).count());
       // System.out.println(stack);
        stack.remove("Rivana");
        //System.out.println(stack);
        stack.push("Vikram");
        //System.out.println(stack);
       // System.out.println(stack.peek());



    }
}
