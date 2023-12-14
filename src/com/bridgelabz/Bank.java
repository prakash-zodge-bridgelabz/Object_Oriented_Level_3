package com.bridgelabz;
//3. Java Program to Create a class Bank Account and the Inner Class Interest in it
//Explanation
//We declare the Outer class as BankAcct and the inner class as Interest.
// Now we use the variables declared in the outer class to get the output in the inner class.
class BankAcct{
    int Account_number;
    String Account_Name;
    class Interest{
        double interest_rate;
        void showDetails(){
            System.out.println("Account Number : "+Account_Name+
                    "\nAccount Name : "+Account_Name+"\nInterest rate : "+interest_rate);
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAcct b = new BankAcct();
        BankAcct.Interest b_i = b.new Interest();
        b.Account_Name="Prakash Zodge";
        b.Account_number = 12345;
        b_i.interest_rate = 5.5;
        b_i.showDetails();
    }
}
