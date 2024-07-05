package Overriding;

public class Main {
    public static void main(String[] args) {
        System.out.println("Runnig Animal class method: ");
        Animal a = new Animal();
        a.sound();
        System.out.println("Runnig cat class method:");
        Animal cat = new Cat();
        cat.sound();
        System.out.println("Runnig dog class method:");
        Animal dog = new Dog();
        dog.sound();
    }
}
