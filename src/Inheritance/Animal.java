package Inheritance;

public class Animal {
    public void sound(){
        System.out.println("....");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("The dog barks..");
    }
}
