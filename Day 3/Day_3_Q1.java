/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class Day_3_Q1 {

    int eng, maths, hin, comp, sci;

    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Marks for English :");
        eng = sc.nextInt();

        System.out.println("Enter the Marks for Maths :");
        maths = sc.nextInt();

        System.out.println("Enter the Marks for Hindi :");
        hin = sc.nextInt();

        System.out.println("Enter the Marks for Comp :");
        comp = sc.nextInt();

        System.out.println("Enter the Marks for Science :");
        sci = sc.nextInt();

    }

    public void calculate() {
        int total = eng + maths + sci + hin + comp;

        int per = (total * 100) / 500;

        if (per > 89) {
            System.out.println("You got A Grade and " + per + "%.");
        } else if (per > 79) {
            System.out.println("You got B Grade and " + per + "%.");
        } else if (per > 69) {
            System.out.println("You got C Grade and " + per + "%.");
        } else if (per > 59) {
            System.out.println("You got D Grade and " + per + "%.");
        } else if (per > 49) {
            System.out.println("You got E Grade and " + per + "%.");
        } else {
            System.out.println("You got F Grade and " + per + "%.");
        }

    }

    public void Display() {
        getData();
        calculate();

    }

    public static void main(String[] args) {
        // TODO code application logic here

        Day_3_Q1 a = new Day_3_Q1();
        a.Display();
    }
}
