package Interface_Bank;

public class Main {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        CreditCard creditCard = new CreditCard();
        payPal.pay();
        payPal.getPaymentDetails();
        creditCard.pay();
        creditCard.getPaymentDetails();


    }
}
