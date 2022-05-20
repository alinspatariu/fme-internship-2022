package fme.internship;

public class Rectangle {
    public String name ="Rectangle";
    public float length;
    public float width;
    public Rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }
    public float Area(float length,float width){
        return length*width;
    }
    public float Permieter(float length,float width){
        return 2*width+2*length;
    }

}
