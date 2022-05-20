/*______________________________________________________________________________________________________
 * 
 * Write a Java program that reads a file containing on each line a geometric shape and its properties
 * in the following format:
 * 
 * Name : property1=value, property2=value, …
 * 
 * Shapes are limited to Circle, Square, Rectangle, Triangle.
 * 
 * Create 2 files area.out and perimeter.out, respectively, and write all the shapes
 * 
 *  - In area.out: in descending order by their area, in the format:
 *      Name: { property1=value, property2=value, ... , area = value }
 *      
 *  - In perimeter.out: in ascending order by their perimeter/circumference, in the format:
 *      Name: { property1=value, property2=value, ... , area = value }
 * 
 * Formulas:
 * 
 *  |===========|===============================|=======================|
 *  |Shape      |Area                           |Perimeter/Circumference|
 *  |===========|===============================|=======================|
 *  |Circle     |PI*r^2                         |2*PI*r                 |
 *  |===========|===============================|=======================|
 *  |Square     |length^2                       |4*length               |
 *  |===========|===============================|=======================|
 *  |Rectangle  |length*width                   |2*(length+width)       |         
 *  |===========|===============================|=======================|
 *  |Triangle   |sqrt(s*(s-a)*(s-b)*s(s-c))     |a+b+c                  |
 *  |           |   where s = (a+b+c)/2         |                       |
 *  |===========|===============================|=======================|
 * _____________________________________________________________________________________________________
 * 
 * 
 * Example:
 * 
 *______________________________________________________________________________________________________
 *
 *  Input: 
 *  
 *  shapes.in
 *      
 *      Circle : r=2
 *      Square : length=4
 *      Rectangle : length=3, width=4
 *      Circle : r=3
 *      Square : length=5
 *      Square : length=3
 *      Triangle: a=3, b=4, c=5
 *       
 *  Output:
 *  
 *  area.out
 *      
 *      Circle: { r=3, area=28.27 }
 *      Square: { length=5, area=25 }
 *      Square: { length=4, area=16 }
 *      Circle: { r=2, area=12.56 }
 *      Rectangle: { length=3, width=4, area=12 }
 *      Square: { length=3, area=9 }
 *      Triangle: { a=3, b=4, c=5, area=6 }
 *      
 *  perimeter.out
 *  
 *      Square: { length=3, perimeter=12 }
 *      Triangle: { a=3, b=4, c=5, perimeter=12 }
 *      Circle: { r=2, perimeter=12.56 }
 *      Rectangle: { length=3, width=4, perimeter=14 }
 *      Square: { length=4, perimeter=16 }
 *      Circle: { r=3, perimeter=18.84 }
 *      Square: { length=4, perimeter=20 }   
 *       
 *______________________________________________________________________________________________________
 *
 *______________________________________________________________________________________________________ 
 */

package fme.internship;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author <Spatariu Alin>
 * @email <spatariualin07@gmail.com>
 * 
 */

public class Test3 {

    public static void main(String[] args) throws FileNotFoundException {
        List<Circle> circles = new ArrayList<>();
        List<Square> squares = new ArrayList<>();
        List<Rectangle> rectangles = new ArrayList<>();
        List<Triangle> triangles = new ArrayList<>();
        File file = new File("C:\\Users\\Alin\\Desktop\\Facultate Automatica\\Jobs\\FME\\fme-internship-2022\\test-internship-p3\\src\\shapes.in");
        Scanner scanner = new Scanner(file);
        System.out.println("FME Internship - Test3");
    }

}