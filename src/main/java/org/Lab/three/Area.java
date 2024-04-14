package org.Lab.three;
class Shape{

    public void area(int side) {
        System.out.println("Area of square is " + side*side);
    }

    public void area(int length, int width) {
        System.out.println("Area of rectangle is " + length * width );
    }
    public void area(double radius) {
        System.out.println("Area of circle is " + Math.PI * radius * radius);
    }
    public void area(double base, double height) {
        System.out.println("Area of triangle is " + 0.5 * base * height);
    }
}



public class  Area extends Shape {
    public static void main(String[] args) {
        Area main = new Area();
        main.area(23.34);
        main.area(12,45);
        main.area(12.33, 32.43);
    }
}