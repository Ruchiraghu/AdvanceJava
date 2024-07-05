package july2;

public class SportsCar extends Car{

    @Override
    public void drive() {
//        super.drive();
        System.out.println("The sports car is racing");
    }

    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.drive();

    }
}
