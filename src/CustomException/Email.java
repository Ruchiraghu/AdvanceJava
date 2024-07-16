package CustomException;

public class Email {
    public String email;

    public Email(String email) throws InvalidEmailException{
       checkEmail(email);
       this.email = email;
    }
    public static void checkEmail(String email) throws InvalidEmailException{
        if(!isValidEmail(email)){
            throw new InvalidEmailException("Invalid email"+email);
        }
    }
    public static boolean isValidEmail(String email){
        return email !=null && email.contains("@");
    }
}
