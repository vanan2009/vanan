package javanangcao;

public class Main 
{
    public static void main(String[] args)
    {
        MovablePoint point = new MovablePoint(0,0,1,1);
        MovableCircle circle = new MovableCircle(5,5,1,1,0);

        System.out.println("Original Point: " + point);
        System.out.println("Original Circle: " + circle);

        point.moveUp();
        circle.moveRight();

        System.out.println("After moving point up and circle right: ");
        System.out.println("Point " + point);
        System.out.println("Circle " + circle);
    }
}