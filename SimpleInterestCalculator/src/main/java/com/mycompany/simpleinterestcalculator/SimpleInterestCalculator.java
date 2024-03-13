/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpleinterestcalculator;

/**
 *
 * @author 111ma
 */
public class SimpleInterestCalculator {
    
    public static void main(String[] args) {
        //Declare variables
        double principal = 1000; 
        double rate = 5; 
        double time = 2; 
        
        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Print the declared variables
        System.out.println("Principal: $" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");

        // Print the result
        System.out.println("Simple Interest: $" + simpleInterest);
    }
}
