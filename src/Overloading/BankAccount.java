package Overloading;

public class BankAccount {
    public double deposit(double amount){
       return amount;
//
    }
    public double deposit(double amount, double interestRate){
        double c = amount*interestRate/100;
        double TotalValue = c+amount;
        return TotalValue;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

       double single =  b.deposit(12000);
        System.out.println("single: "+single);
       double two =  b.deposit(12000,12);
        System.out.println("With interest: "+two);
    }
}
