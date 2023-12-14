package com.bridgelabz;
//8. Java Program to use of Constructor Chaining:(Read about this first)
//Explanation
//1. A class named ConstructorChaining is defined with three constructors.
//2. The first constructor is the default constructor, which calls the second
// constructor with the argument value of 20 using this(20).
//3. The second constructor is a parameterized constructor that takes one integer argument.
// It prints the value of x and is called from the default constructor using this(20).
//4. The third constructor is also a parameterized constructor that takes two integer arguments.
// It calls the default constructor using this() and prints the value of x and y as well
// as their sum.
//5. The main method calls the third constructor with arguments 11 and 12, which in turn
// calls the default constructor and prints the desired output.
class Constructor_Chaining{
    Constructor_Chaining(){
        this(20);
    }
    Constructor_Chaining(int x){
        System.out.println("Value of x : "+x+" and is called from the default " +
                "constructor using this(20)");
    }
    Constructor_Chaining(int x,int y){
        this();
        System.out.println("Sum of two elements : "+(x+y));
    }
}
public class Use_of_constructor_chaining {
    public static void main(String[] args) {
        Constructor_Chaining c = new Constructor_Chaining(11,12);
    }
}
