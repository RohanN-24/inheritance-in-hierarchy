package Heirarchy;

public class Circle extends Shape {
    private float r;
    public Circle(float radius){
        r=radius;
    }
    public float area(){
        return 3.14f*r*r;

    }
}
