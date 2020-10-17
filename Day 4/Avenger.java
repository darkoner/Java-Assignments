/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_4;

import java.util.Scanner;

/**
 *
 * @author Ravinder
 */
public class Avenger {

    /**
     * @param args the command line arguments
     */
    Scanner sc = new Scanner(System.in);
    String name, power, weapon, planet;
    int age;

    public void getDetails() {
        System.out.println("Enter name : ");
        name = sc.next();
        System.out.println("Enter Power : ");
        power = sc.next();
        System.out.println("Enter Weapon : ");
        weapon = sc.next();
        System.out.println("Enter Planet : ");
        planet = sc.next();
        System.out.println("Enter Age : ");
        age = sc.nextInt();
        //for space between inputs
        System.out.println("");

    }

    public void displayDetails() {
        
        System.out.println("Name : " + name);
        System.out.println("Power : " + power);
        System.out.println("Weapon : " + weapon);
        System.out.println("Planet : " + planet);
        System.out.println("Age : " + age);
       
        //for space between outputs
        System.out.println("");

    }

    public static void main(String[] args) {
        // TODO code application logic here

        Avenger[] avg = new Avenger[5];

        for (int i = 0; i < 5; i++) {
            avg[i] = new Avenger();

        }
        for (int i = 0; i < 5; i++) {
            avg[i].getDetails();
        }
        for (int i = 0; i < 5; i++) {
            avg[i].displayDetails();
        }
    }

}