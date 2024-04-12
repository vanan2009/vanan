package javanangcao2;

public class Circle implements GeometricObject
{
    private double radius;

    public Circle(double radius)
    {
        this.radius=radius;
    }


    @Override
    public double getPerimeter() 
    {
        return 2*radius*Math.PI;
    }

    @Override
    public double getArea() 
    {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() 
    {
        return "Circle[radius=" + radius + "]";
    }
}
