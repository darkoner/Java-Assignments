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
public class Q3 {

    public static void main(String[] args) {
        // TODO code application logic here

        int[] sum = new int[5];
        int total = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter the number : ");
            sum[i] = sc.nextInt();
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {

            total += sum[i];
        }
        System.out.print("Sum of the given numbers is : " + total);

    }
}
