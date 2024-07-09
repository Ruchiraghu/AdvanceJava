package Final;

final class FinalClass {
    void printMessage(){
        System.out.println("I am method in final class.");
    }
//class subclassOfFinalClass extends FinalClass{
//        //you can inherit or extends final class
//}
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();

    }
}
