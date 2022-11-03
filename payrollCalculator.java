/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scannerkeyboard;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class payrollCalculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        String name;
        int hours;
        int payRate;
        double grossPay;
        
        System.out.println("What is your name?");
        name= input.next();
        
        System.out.println( "How many hours did you work this week?");
        hours= input.nextInt();
        
        System.out.println( "What is your hourly pay rate? ");
        payRate= input.nextInt();
        
        grossPay = hours * payRate;
        System.out.println("Hello, " + name);
        System.out.println("Your gross pay is $ " + grossPay);
    }
    
}
