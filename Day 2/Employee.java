/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Ravinder
 */
public class Employee {
    
    String name = "Saurabh";
    String city = "Chennai";
    int age = 23;

    public void display()
    {
        System.out.println("The name is "+ name);
        System.out.println("The age is "+ age);
        System.out.println("The city is "+ city);
        
        //for space between 2 output
        System.out.println();
    }
     public static void main(String[] args) {
        // TODO code application logic here
       
        Employee e1=new Employee();
        e1.display();
        
        Employee e2=new Employee();
        e2.display();
    }

}
