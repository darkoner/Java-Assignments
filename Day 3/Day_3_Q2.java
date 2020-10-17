/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Date;
import java.util.Scanner;

public class Day_3_Q2 {

    String name;
    int dob, mob, yob, m_sal;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the Employee : ");
        name = sc.next();

        System.out.println("Enter the Date of Birth : ");
        dob = sc.nextInt();

        System.out.println("Enter the Month of Birth : ");
        mob = sc.nextInt();

        System.out.println("Enter the Year of Birth : ");
        yob = sc.nextInt();

        System.out.println("Enter Monthly Salary : ");
        m_sal = sc.nextInt();
    }

    public void calculate() {
        Date d = new Date();
        int ann_sal = m_sal * 12;
        int tax_amt, age;
        
//to calculate age
        String str = String.format("%tY", d );
        age = Integer.parseInt(str) - yob;
        

// to calculate Tax amount
        if (ann_sal >= 500000) {
            tax_amt = (ann_sal * 20) / 100;
        } else if (ann_sal >= 400000) {
            tax_amt = (ann_sal * 15) / 100;
        } else if (ann_sal >= 300000) {
            tax_amt = (ann_sal * 10) / 100;
        }
        else if (ann_sal >= 200000) {
            tax_amt = (ann_sal * 5) / 100;
        } else {
            tax_amt = 0;
        }

        System.out.println("Age : "+age+".");
        System.out.println("Annual salary : "+ann_sal+".");
        System.out.println("Tax Amount : "+tax_amt+".");
    }

    public void display(){
        
        System.out.println("Name : "+name);
        calculate();
        
    }
    public static void main(String[] args) {
        // TODO code application logic here

        Day_3_Q2 a = new Day_3_Q2();
        a.getData();
        a.display();
    }
}
