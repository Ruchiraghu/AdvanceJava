package practice;
import java.util.Scanner;
public class Star_pattern {
    //Increasing Order

    public static void printStarFirst() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Decreasing Pattern
    public static void printStarSecond(){
        System.out.println("Enter number of rows: ");
            Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Square pattern
    public static void squarePattern(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(i==0||i==a-1||j==0||j==a-1) {
                    System.out.print("*"+" ");
                }
                else{
                System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
    //Pyramid
    public static void pyramidPattern(int rows){
        for(int i=0;i<rows;i++){
            for(int j=rows-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Left Pyramid
    public static void leftPyramid(int rows){
        for(int i=1;i<rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//pattern1
//  ****
//  ***
//  **
//  *
    public static void pattern1(int n) {
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            } System.out.println();
        }

    }
    /*pattern2
      1
      1 2
      1 2 3
      1 2 3 4
      1 2 3 4 5*/
    public static void pattern2(int n) {
        for(int i =0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
//patter3
//*
//**
//***
//****
//***
//**
//*
   public static void pattern3(int n) {
        for(int i=0;i<2*n;i++){
            int k=i>n?2*n-i:i;
            for (int j=0;j<k;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

 }
 //  1
//  2 2
// 3 3 3
//4 4 4 4
    public static void pattern4(int n) {
        for(int row=1;row<=n;row++ ){
            for(int col=1;col<=row;col++){
                    System.out.print(row + " ");
                }
                System.out.println();
            }
    }
}


