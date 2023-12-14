package com.bridgelabz;

import java.util.Scanner;

//4. Java Program to Implement Shape Interface using Circle and Rectangle Class
//Explanation:
//Interfaces are syntactically similar to classes, but they lack instance variables,
// and their methods are declared without any body. Here we make the interface as
// Shape with two methods as input() and area() which are implemented by further two
// classes as circle and rectangle who implements the interface Shape.
interface Shape{
    void input();
    void area();
}
class Circle implements Shape{
    Scanner sc = new Scanner(System.in);
    double radius;
    public void input() {
        System.out.println("Enter radius : ");      radius = sc.nextDouble();
    }
    public void area() {
        System.out.println("Area of Circle is : "+(Math.PI * radius * radius));
    }
}
class Rectangle implements Shape{
    Scanner sc = new Scanner(System.in);
    double length,width;
    public void input() {
        System.out.println("Enter length : ");      length = sc.nextDouble();
        System.out.println("Enter width : ");      width = sc.nextDouble();
    }
    public void area() {
        System.out.println("Area of Rectangle is : "+(length * width));
    }
}
public class Implement_shape_interface_using_Circle_and_Rectangle_class {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.input();
        c.area();
        System.out.println("----------------------------");
        Rectangle r = new Rectangle();
        r.input();
        r.area();
    }
}
