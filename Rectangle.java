package Heirarchy;

public class Rectangle extends Shape {
    private int length, breadth;
    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public float area(){
        return length*breadth;
    }
    
}
