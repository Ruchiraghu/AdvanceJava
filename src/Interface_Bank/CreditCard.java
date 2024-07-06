package Interface_Bank;

public class CreditCard implements PaymentMethod{
//    private long cardNumber;
//    private String expirationDate;
//    CreditCard(long cardNumber,String expirationDate){
//        this.cardNumber = cardNumber;
//        this.expirationDate = expirationDate;
//    }

   public void pay(){
       System.out.println("using credit card");


    }
    public void getPaymentDetails() {
        System.out.println("Enter your Card Number: ");
        long cardNumber = sc.nextLong();
        //System.out.println("card number: "+cardNumber);
        System.out.println("Your expiry date");
        String expirationDate = sc.next();
        //System.out.println("Expiry date: "+expirationDate);

    }

    }
