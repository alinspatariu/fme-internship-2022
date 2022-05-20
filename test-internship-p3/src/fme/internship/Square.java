package fme.internship;

public class Square {
    public String name = "Square";
    public float length;
    public Square(float length){
        this.length=length;
    }
    public float Permeter(float length){
        return 4*length;
    }
    public float Area(float length){
        return length*length;
    }
}
