package com.bridgelabz;
//1. Java Program to create a calculator and apply all  features of Abstract class
//Explanation:
//Need  to create made add(),multiply(), divide(), Subtract()  as abstract methods
// in parent class which are defined in child class and we can call all these methods
// via making object of child class.as abstract methods in parent class which are
// defined in child class and we can call all these methods via making object of child class.
abstract class Functions{
    abstract void add(double a, double b);
    abstract void multiply(double a, double b);
    abstract void divide(double a, double b);
    abstract void subtract(double a, double b);
}
class Arithmetic_Operations extends Functions{
    void add(double a, double b){
        System.out.println("Additions is : "+(a+b));
    }
    void multiply(double a, double b){
        System.out.println("Multiplication is : "+(a*b));
    }
    void divide(double a, double b){
        System.out.println("Division is : "+(a/b));
    }
    void subtract(double a, double b){
        System.out.println("Subtraction is : "+(a-b));
    }
}
public class Calculator {
    public static void main(String[] args) {
        Arithmetic_Operations f = new Arithmetic_Operations();
        int a = 10,b=5;
        f.add(a,b);
        f.multiply(a,b);
        f.divide(a,b);
        f.subtract(a,b);
    }
}
