//package org.Lab.three;
//
//import java.util.Scanner;
//
//class Shape {
//    public void area() {
//        System.out.println("Area cannot be calculated for generic shapes.");
//    }
//}
//
//class Triangle extends Shape {
//    public void area(double base, double height) {
//        System.out.println("Area of Triangle: " + 0.5 * base * height);
//    }
//}
//
//class Square extends Shape {
//    public void area(double side) {
//        System.out.println("Area of Square: " + side * side);
//    }
//}
//
//class Circle extends Shape {
//    public void area(double radius) {
//        System.out.println("Area of Circle: " + Math.PI * radius * radius);
//    }
//}
//
//public class AreaCalculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Triangle triangle = new Triangle();
//        Square square = new Square();
//        Circle circle = new Circle();
//
//        System.out.println("Enter base and height of triangle separated with space: ");
//        double base = scanner.nextDouble();
//        double height = scanner.nextDouble();
//        triangle.area(base, height);
//
//        System.out.println("Enter side of square: ");
//        double side = scanner.nextDouble();
//        square.area(side);
//
//        System.out.println("Enter radius of circle: ");
//        double radius = scanner.nextDouble();
//        circle.area(radius);
//
//        scanner.close();
//    }
//}