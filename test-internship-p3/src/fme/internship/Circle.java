package fme.internship;

public class Circle {
    public String name = "Circle";
    public float radius;
    public float Area(int radius){
        return (float) (Math.PI*radius*radius);
    }
    public float Permieter(int radius){
        return (float) (Math.PI*2*radius);
    }

}
