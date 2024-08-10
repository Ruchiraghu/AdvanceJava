package Interface_Bank;

public class CreditCard implements PaymentMethod{
//    private long cardNumber;
//    private String expirationDate;
//    CreditCard(long cardNumber,String expirationDate){
//        this.cardNumber = cardNumber;
//        this.expirationDate = expirationDate;
//    }

   public void pay(){System.out.println("----Credit Card----");



    }
    public void getPaymentDetails() {
        System.out.println("Enter your Card Number: ");
        long cardNumber = sc.nextLong();

        System.out.print("Your expiry date: ");
        String expirationDate = sc.next();
        System.out.println("using credit card");
        System.out.println("card number: "+cardNumber);
        System.out.println("Expiry date: "+expirationDate);

    }

    }
