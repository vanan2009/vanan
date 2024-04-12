package javanangcao2;

public class TestResizableCircle 
{
    public static void main(String[] args)
    {
        ResizableCircle resizableCircle = new ResizableCircle(3);
        System.out.println("Before Resizing: "+resizableCircle);
        resizableCircle.resize(10);
        System.out.println("After Resizing: "+resizableCircle);
    }
}

