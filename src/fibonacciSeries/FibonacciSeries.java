package fibonacciSeries;

import java.awt.*;
import java.util.Scanner;
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181

public class FibonacciSeries {
    public static void main(String[] args) {
        int a =0, b=1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = sc.nextInt();
        System.out.print(a+", "+b);
        for (int i=2;i<=count;i++){
            c = a+b;
            System.out.print(", "+c);
            a =b;
            b=c;


        }
    }
}
