package Exception;

public class JavaException {

    public static void main(String[] args) {
        try{
            int divide = 12/0;

        }catch(ArithmeticException e){
            e.printStackTrace();
           //  System.out.println(e);
        }
        System.out.println("rest code");
    }
}
