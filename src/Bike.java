//abstract class Bike {
//
//    public abstract void run();
//
//
//    public void display() {
//        System.out.println("nikhil");
//    }
//}
//
//
//class Circle extends Bike {
//    public void run() {
//        System.out.println("raghuwanshi");
//    }
//    public static void main(String[] args) {
//        Bike shape = new Circle();
//        shape.run();
//        shape.display();
//    }
//}
//
abstract class Bike{
    abstract void run();

  abstract void speed();
    abstract void fuel();
    public static void main(String[] args) {
        Bike b = new Bike() {
            @Override
            void run() {
                System.out.println("runing");
            }

            @Override
            void fuel() {
                System.out.println("Fuel is low");
            }
            void speed(){
                System.out.println("Lower down your speed.");
            }
        };
        b.fuel();
        b.run();
        b.speed();
    }
}













