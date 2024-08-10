package Exception;

public class CustomException {
    public static void ageChecking(int age) throws InvalidException{
        if(age>=18){
            System.out.println("You can drive");
        }
        else{
            throw new InvalidException("You are below 18 you cannot drive!!");
        }

    }

    public static void main(String[] args) {
        try{
            ageChecking(12);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("100 lines of code");

    }

}
