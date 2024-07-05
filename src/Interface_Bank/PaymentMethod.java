package Interface_Bank;
import java.util.Scanner;
interface PaymentMethod {
    Scanner sc = new Scanner(System.in);

    void pay();
    void getPaymentDetails();

}
