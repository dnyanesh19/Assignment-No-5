/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 

/**
 *
 * @author SHARDUL
 */
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
        for(int i=1; i<=10; i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
    }
}

    

