package com.bridgelabz;
//2. Java Program to Illustrates Use of Static Inner Class
//Explanation:
//made an Outer class and define a static Inner class in it.
// We define a non-static method as the show() method in inner class and
// we try to call this method by inner class object and outer class object and
// we get the desired output.
class Outer_class{
    static class Inner_static_class{
        void show(){
            System.out.println("This is show method from static inner class");
        }
    }
}
public class Use_of_static_inner_class {
    public static void main(String[] args) {

        Outer_class.Inner_static_class o_i =new Outer_class.Inner_static_class();
        o_i.show();
    }
}
