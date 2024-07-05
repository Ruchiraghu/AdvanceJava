package Abstract_practice;

public class Circle {
    double pie = 3.14;
    int r;
    Circle(int r){
        this.r = r;
    }

   public void calculateArea(){
        double area = pie*r*r;
        System.out.println("Area of circle is: "+area);
    }
}
