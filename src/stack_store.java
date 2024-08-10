import java.util.Iterator;
import java.util.Stack;

public class stack_store {
    public static void main(String[] args) {
        Stack<String > stack = new Stack<>();
        stack.push("abhi");
        stack.push("abhimanyu");
        stack.push("abhishek");
        stack.push("abhiman");
        stack.push("sabhi");
        stack.push("ajeet");
        stack.push("aasu");
        stack.push("neelu");
        stack.push("nita");
        stack.push("tiya");
        for (int i = 0;i<=3;i++){

            String popped = stack.pop();
            System.out.println("Popped elements: "+popped);
        }
//        System.out.println(stack);
        System.out.println("Stack after all pops: ");
        Iterator itr = stack.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
