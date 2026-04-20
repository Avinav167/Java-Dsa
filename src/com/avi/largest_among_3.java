package com.avi;
import java.util.Scanner;
public class largest_among_3 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a =sc.nextInt();
        System.out.println("Enter the 2st number:");
        int b =sc.nextInt();
        System.out.println("Enter the 3st number:");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else if(c>=a && c>=b){
            System.out.println(c);
        }
    }
}
