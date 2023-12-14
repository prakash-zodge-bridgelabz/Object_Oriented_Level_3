package com.bridgelabz;
//7. Java Program to Create a Method with 2 Parameters and without Return Type
//Explanation:
//Enter the length and breadth of the rectangle as input. Now we pass these values
// as parameters to the new method where we calculate the area and print the output.
class Calculate_Area_of_Rectangle{
    double length,breadth;
    void area_of_rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
        System.out.println("Area of rectangle : "+(length * breadth));
    }
}
public class Method_with_2_parameters_and_without_return_type {
    public static void main(String[] args) {
        Calculate_Area_of_Rectangle c = new Calculate_Area_of_Rectangle();
        c.area_of_rectangle(2,3);
    }
}
