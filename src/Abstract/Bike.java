package Abstract;

public abstract class Bike {
    abstract void run();

public void bikeBody(){
    System.out.println("Showing body of bike...");
}
    private void gear(int gears) {
        System.out.println("Five gears.. " + gears);
    }
    public void gear() {
        System.out.println("Default gear method...");
    }
}
