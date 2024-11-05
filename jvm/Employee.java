package jvm;

import java.lang.reflect.Method;

public class Employee {
    public String empName(){
        return null;

    }
    public int empId(){
        return 1;

    }
    public static void main(String[] args) throws Exception{
        int count = 0;
        Class c = Class.forName("java.lang.String");
        System.out.println(c);
        Method[] m = c.getDeclaredMethods();
        System.out.println(m);
        for (Method m1:m
             ) {
            count++;
            System.out.println(m1.getName());

        }

    }
}
