interface Shape

{

    void draw();

}

class Circle implements Shape

{

    public void draw()

    {

        System.out.println("Drawing a circle");

    } }

class Rectangle implements Shape

{

    public void draw()

    {

        System.out.println("Drawing a rectangle");

    } }
 class Main { public static void main(String[] args)

{

    Shape[] shapes = new Shape[3];

    shapes[0] = new Circle();

    shapes[1] = new Rectangle();

    shapes[2] = new Circle();

    for (Shape shape : shapes)

    {

        shape.draw();

    }

}

}