import java1.task9.Triangle;

import java.awt.*;

public class testShape {
    public static void main(String[] args){
        Shape s1 = new Rectangle(1,2);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());

        Shape s2 = new Triangle(3,4);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());

        Shape s3 = new Shape("green");
        //compilation error : Shape is abstract; cannot be instantiated
    }
}
