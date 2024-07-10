package String;

public class StringTopic {
    public static void main(String[] args) {
        //Question-1
        System.out.println("Question1---");
        String s = "Hello";
        String t = s+" world";
        System.out.println(t);
        System.out.println();
        //Question2
        System.out.println("Question2---");
        String check = "Hello Ruchi";
        System.out.println(check.contains("chi"));
        System.out.println();
        //Question3
        System.out.println("Question3---");
        System.out.println(check.length());
        //Question4
        System.out.println("Question4---");
        String intro = " Hello my name is sita";
        System.out.println(intro.trim());
        System.out.println(intro.trim()+check.trim());
        System.out.println();
        //Question5
        System.out.println("Question5--");
       String[]  split =  check.split(" ");
        for (String str:split){
            System.out.println(str);
        }
        System.out.println();

        //Question 6
        System.out.println("Question 6--");
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        System.out.println("Before: "+s);
        System.out.println("After: "+ reverse);
        System.out.println();
        //Question 7
        System.out.println("Question 7----");
        System.out.println(s.substring(2));//Hello
        System.out.println(check.substring(0,6));//Hello Ruchi
        //Question 8
        System.out.println("Question8");
        System.out.println(s.replace('o','i'));
        System.out.println();

        //Question9
        String eq = "Hello";
        String equ = new String("Hello");
        System.out.println("Question 9");
        System.out.println(s.equals(check));
        System.out.println(s.equals(eq));

        //Question 10
        System.out.println("Question 10");
        String str1 = "String";
        String str2 = "string";
        System.out.println(str1.equalsIgnoreCase(str2));

        //Question 11
        System.out.println("Question 11");
        String str4 = "Counting the occurrence of the characters";
        char find = 'c';
        int occ = str4.length()-str4.replace(String.valueOf(find),"").length();
        System.out.println(occ);

    }
}
