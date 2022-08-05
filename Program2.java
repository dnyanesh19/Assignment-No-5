/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Write a program to calculate the sum of first 10 natural number.

/**
 *
 * @author SHARDUL
 */
public class Program2 {
    public static void main(String[]args)
    {
        int i,num=10,sum=0;
        for(i=1;i<=num;++i)
        {
            sum=sum+i;
        }
        System.out.println("Sum of first 10 natural numbers is="+sum);
    }
}
