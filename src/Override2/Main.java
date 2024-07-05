package Override2;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.drive();
        Vehicle car = new Car();
        car.drive();
        Vehicle Motorcycle = new Motocycle();
        Motorcycle.drive();
    }
}
