package jvm;

import java.lang.reflect.Method;

public class Student {
    public  String getName(){
        return null;
    }
    public  int getMarks(){
        return 10;
    }
    public static void main(String[] args)throws Exception {
        int count =0;
        Class c = Class.forName("jvm.Student");
        Method[] m = c.getDeclaredMethods();
        for (Method m1:m){
            count++;
            System.out.println(m1.getName());
        }
        System.out.println("The number of methods: "+count);
    }
}
