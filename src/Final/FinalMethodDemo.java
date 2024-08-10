package Final;

public class FinalMethodDemo {
    final double pie = 3.14;
    final double calculateArea(double radius){
        double area = pie*Math.pow(radius,2);
        return area;
    }
//    class subclassOfFinal extends FinalMethodDemo{
//        @Override //You cant override final methods
//        final double calculateArea(double radius){
//            return 0;
//        }
//    }

    public static void main(String[] args) {
        FinalMethodDemo fmd =new FinalMethodDemo();

        System.out.println( fmd.calculateArea(12));
    }
}
