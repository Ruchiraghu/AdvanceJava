package numSwap;

import java.util.Scanner;

public class NumSwap {
    Scanner sc = new Scanner(System.in);
    int a,b;
    public void numswap(){
        System.out.println("enter value of a:");
        int a = sc.nextInt();
        System.out.println("enter value of b: ");
        int b = sc.nextInt();
        a = a+b;//1+11= 12
        //12-11 = 1
        b = a-b;
        //12-1  = 11
        a =a-b;

        System.out.println("a: "+a);
        System.out.println("b: "+b);


    }
}
