/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Write a program to find the factorial value of any number entered through the keyboard

/**
 *
 * @author SHARDUL
 */
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
       
        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }
        
        System.out.println("Factorial: "+ fact);
    }
} 

    

