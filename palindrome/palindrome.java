package palindrome;

public class palindrome {
    public static boolean isPalindrome(int num){
        int reverse =0;
        int temp = num;
        while (temp!=0){
            reverse = (reverse*10)+(temp%10);
            temp = temp/10;
        }
        return (reverse==num);
    }

    public static void main(String[] args) {
        int num = 1221;
        if (isPalindrome(num)){
            System.out.println("yes ");
        }
        else{
            System.out.println("No");
        }
    }
}
