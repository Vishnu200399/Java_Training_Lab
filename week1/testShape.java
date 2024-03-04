abstract class Shape 
{
    abstract void calculateArea();
}
class Rectangle extends Shape
{
    int l = 3;
    int b = 5;
    void calculateArea()
    {
        System.out.println("Area of Rectangle is:"+l*b);
    }
}
class Circle extends Shape
{
    int r= 5;
    void calculateArea()
    {
        System.out.println("Area of Circle is:"+3.14*r*r);
    }
}
public class testShape
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.calculateArea();
        Circle c = new Circle();
        c.calculateArea();

    }
}

