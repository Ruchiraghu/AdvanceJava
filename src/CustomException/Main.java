package CustomException;

public class Main {
    public static void main(String[] args) {
        try {
            Email email = new Email("ruchi23gmail.com");

        }
        catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
        try {
            Email email1 = new Email("ruchi12@gmail.com");
            System.out.println("Successfully created your email."+email1.email);

        }catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }
}
