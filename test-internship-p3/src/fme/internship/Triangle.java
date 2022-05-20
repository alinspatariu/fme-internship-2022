package fme.internship;

import static java.lang.Math.sqrt;

public class Triangle {
    public String name = "Triangle";
    public float aside;
    public float bside;
    public float cside;
    public Triangle(float aside,float bside,float cside){
        this.aside=aside;
        this.bside=bside;
        this.cside=cside;
    }
    public float Perimeter(float aside,float bside, float cside){
        return aside+bside+cside;
    }
    public float Area(float aside,float bside, float cside){
        double s = (aside+bside+cside)/2;
        return (float) sqrt(s*(s-aside)*(s-bside)*(s-cside));
    }

}
