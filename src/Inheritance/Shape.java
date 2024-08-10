package Inheritance;

public class Shape {
    double pie = 3.14;
    public double area(){
        return 0;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
       double React = r.area(1,2);
        System.out.println("Area of rectangle: "+React);
        Circle c = new Circle();
        double circle = c.area(12);
        System.out.println("Area of circle: "+circle);
    }
}
    class Circle extends Shape{
        public double area(int r){
            double circleArea = pie*r*r;
            return circleArea;
        }

    }
 class Rectangle extends Shape{
        public double area(int l,int b){
            double rectArea = l*b;
            return rectArea;
        }

    }


