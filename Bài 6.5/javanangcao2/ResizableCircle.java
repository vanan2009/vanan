package javanangcao2;

public class ResizableCircle extends Circle implements Resizable
{
    public ResizableCircle(double radius)
    {
        super(radius);
    }

    @Override
    public void resize(int percent) 
    {
        double radius = percent / 100.0;
    }

    @Override
    public String toString() 
    {
        return "ResizableCircle["+super.toString()+"]";
    }
}
