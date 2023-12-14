package com.bridgelabz;
//6. Java Program to Create a Method without Parameters and with Return Type
//Explanation:
//We have made a method to calculate the volume of a cuboid which takes the
// dimensions length, breadth and height as input and returns the volume as
// output back to the main method.
class Calculate_perimeter_area_and_volume_of_cuboid{
    double length,breadth,height,perimeter_of_cuboid,area_of_cuboid,volume_of_cuboid;
    void input(double length, double breadth, double height){
        this.length=length;
        this.breadth=breadth;
        this.height = height;
    }
    double getVolume_of_Cuboid(){
        volume_of_cuboid = length * breadth * height;
        return volume_of_cuboid;
    }
    double getArea_of_Cuboid(){
        area_of_cuboid = 2 * ((length*breadth)+(breadth*height)+(height*length));
        return area_of_cuboid;
    }
    double getPerimeter_of_Cuboid(){
        perimeter_of_cuboid = 4 * ( length + breadth + height);
        return perimeter_of_cuboid;
    }
}
public class Method_without_parameters_and_with_return_type {
    public static void main(String[] args) {
        Calculate_perimeter_area_and_volume_of_cuboid c = new Calculate_perimeter_area_and_volume_of_cuboid();
        c.input(2,3,4);
        System.out.println("Volume of Cuboid is : "+c.getVolume_of_Cuboid()+
                "\nArea of Cuboid is : "+c.getArea_of_Cuboid()+
                "\nPerimeter of Cuboid is : "+c.getPerimeter_of_Cuboid());
    }
}
