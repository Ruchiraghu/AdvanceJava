interface Shape1

{

    void draw();

}

class Circle implements Shape1

{

    public void draw()

    {

        System.out.println("Drawing a circle");

    } }

class Rectangle implements Shape1

{

    public void draw()

    {

        System.out.println("Drawing a rectangle");

    } }
class Mainn { public static void main(String[] args)

{

    Shape1[] shapes = new Shape1[3];

    shapes[0] = new Circle();

    shapes[1] = new Rectangle();

    shapes[2] = new Circle();

    for (Shape1 shape : shapes)

    {

        shape.draw();

    }

}

}