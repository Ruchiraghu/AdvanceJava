package GmailAccount;
import java.util.Scanner;
public class Gmail {
    String email;


    public void creatingGmail() throws InvalidEmailException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email address");
        String userInput = sc.next();
        if (!isValidGmail(userInput)) {
            throw new InvalidEmailException("Invalid email: "+userInput);
        }
        this.email = userInput;
        System.out.println("Successfully created your account: "+this.email);
    }
    public boolean isValidGmail(String email){
        return email!=null && email.contains("@");
    }

    public class InvalidEmailException extends RuntimeException{
        public InvalidEmailException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        Gmail emailAccount = new Gmail();
        try{
            emailAccount.creatingGmail();
        }catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }
}

