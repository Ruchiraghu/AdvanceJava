package LambdaExpression;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       LambdaExpression le =  ()->{
            System.out.println("Greetings.....");
        };
       le.words();
       LambdaExpressionParameter lep = (h,b)->{
           System.out.println("Enter your name: ");
           String name = sc.next();
           System.out.println(h+" "+ name.toUpperCase()+" Good Morning!!! ");
           System.out.println(b);

       };
       lep.greeting("Hello!","Have a nice day :)");
    }
}
