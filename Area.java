package Heirarchy;

public class Area {
    public static void main(String[] args) {
    Rectangle obj = new Rectangle(15,4);
    Circle objCircle = new Circle(5.8f);
    
    System.out.println("Area of circle is "+objCircle.area());
    System.out.println("Area of Rectangle is "+obj.area());

    }
    
    
     

}
