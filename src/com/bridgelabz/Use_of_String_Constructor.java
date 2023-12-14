package com.bridgelabz;
//9. Java Program to use of String Constructor
//
//Explanation:
//Constructor is used to initialize an object. Here you need to make
// two classes as Super and Sub class using Inheritance. We initialize
// two different strings in the constructors of these two classes and
// with the help of the object of Subclass we print these strings.
// Java Program to Allocate and Initialize Super Class Members using Constructor
class Super_class{
    String a, b;
    Super_class(String a, String b){
        this.a = a;
        this.b = b;
        display_String();
    }
    void display_String(){
        System.out.println("First String : "+a+"\nSecond String : "+b);
    }
}
class Sub_class extends  Super_class{
    Sub_class(String a, String b) {
        super(a, b);
    }
}
public class Use_of_String_Constructor {
    public static void main(String[] args) {
        Sub_class s = new Sub_class("Prakash","Zodge");
    }
}
