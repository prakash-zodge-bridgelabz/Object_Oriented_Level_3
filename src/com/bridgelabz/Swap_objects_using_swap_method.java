package com.bridgelabz;
//5. Java Program to Swap Objects using Swap() Method
//
//Explanation:
//Make a swap method to interchange the information of two employees using
// Employee Objects by passing them to swap() method.
class Employee{
    int emp_id;
    String emp_name;
    Employee(int emp_id, String emp_name){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        display_details();
    }
    void display_details(){
        System.out.println("Employee id : "+emp_id+"\nEmployee Name : "+emp_name);
    }
}
public class Swap_objects_using_swap_method {
    static void swap_objects(Employee e1, Employee e2){
        //Swapping name
        String temp_name = e1.emp_name;
        e1.emp_name = e2.emp_name;
        e2.emp_name = temp_name;

        //Swapping ID
        int temp_id = e1.emp_id;
        e1.emp_id = e2.emp_id;
        e2.emp_id = temp_id;

        //After swapping Details
        System.out.println("After swapping objects :");
        System.out.println("First Employee : ");
        e1.display_details();
        System.out.println("Second Employee : ");
        e2.display_details();
    }
    public static void main(String[] args) {
        System.out.println("First Employee : ");
        Employee e1 = new Employee(101, "Prakash Zodge");
        System.out.println("Second Employee : ");
        Employee e2 = new Employee(123, "Jack Sparrow");
        swap_objects(e1,e2);
    }
}
