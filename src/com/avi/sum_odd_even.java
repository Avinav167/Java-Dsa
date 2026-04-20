//Write a Java program that takes a number n and calculates the sum of even and odd numbers in the range from 0 to n-1
package com.avi;
import java.util.Scanner;
public class sum_odd_even {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Set the Range of the integers");
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        int j=0;
        System.out.println("The Numbers:");
        for(int i=0;i<n;i++){
            j=i;
                if(j%2==0){
                    evensum=evensum+j;
                }
                else{
                    oddsum=oddsum+j;
                }
        }
        System.out.println("Sum of Even Number is:"+evensum);
        System.out.println("Sum of Odd Number is :"+oddsum);
    }
}
