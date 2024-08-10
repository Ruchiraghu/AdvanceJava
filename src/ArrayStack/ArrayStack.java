package ArrayStack;

public class ArrayStack {
    private int[] array;
    private int top;

    public ArrayStack(int capacity) {
        array = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if(top==array.length-1){
            throw new StackOverflowError("Stack is full");
        }
        array[++top] = element;
    }

    public int pop() {
        // TODO: implement pop operation
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }

    public int peek() {
        // TODO: implement peek operation
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

    public boolean isEmpty() {
        // TODO: implement isEmpty operation
        return top==-1;
    }

    public int size() {
        // TODO: implement size operation
        return top+1;
    }

    public void printAllElements(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack elements: ");
            for(int i =0;i<=top;i++){
                System.out.println(array[i]+" ");
            }
            System.out.println();
        }
    }
}
