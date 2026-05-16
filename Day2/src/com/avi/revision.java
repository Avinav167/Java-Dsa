package com.avi;
import java.util.Scanner;
public class revision {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int div=2;
        boolean isPrime=true;
        while(div<n){
            if(n%div==0){
                isPrime=false;
                break;
            }
                div++;
        }
        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
