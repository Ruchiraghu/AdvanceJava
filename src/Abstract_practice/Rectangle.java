package Abstract_practice;

public class Rectangle {
   int l,b;

    Rectangle(int l, int b){
        this.l = l;
        this.b = b;

    }
    public void calculateArea(){
        int area = l*b;
        System.out.println("Area of rectangle is: "+area);
    }
}
