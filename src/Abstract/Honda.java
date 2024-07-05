package Abstract;

public class Honda extends Bike{
    void run(){
        System.out.println("I am runnig...");
    }

    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
        h.bikeBody();
        h.gear();
    }
}
