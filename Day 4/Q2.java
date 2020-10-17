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
public class Q2 {
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] odd=new int[5];
        Scanner sc= new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            
            System.out.print("Enter the number : ");
            odd[i]=sc.nextInt();
        }
        System.out.println("");
        System.out.print("ODD numbers from the list are : ");
        
        for (int i = 0; i < 5; i++) {
            
            if (odd[i]%2!=0) {
                System.out.print(odd[i]+" ");
            }
           
        }
        
    }
}
