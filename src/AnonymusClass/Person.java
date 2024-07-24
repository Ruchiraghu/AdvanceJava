package AnonymusClass;

abstract class Person {
    abstract void walk();
    abstract void eat();
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            void walk() {
                System.out.println("I am walking");
            }
            void eat(){
                System.out.println("I am eating");
            }
        };
        p.eat();
        p.walk();


    }
}
