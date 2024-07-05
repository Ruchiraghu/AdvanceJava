package Interface_Bank;

public class PayPal implements PaymentMethod{


  public void pay(){
      System.out.println("using paypal");
    }
   public void getPaymentDetails(){
       String email;
       System.out.println("Enter your Email: ");
       email = sc.next();
       System.out.println(email);
    }
}
