package com.avi;
import java.util.Scanner;
public class re {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int div=2;
        if(num<=1){
            System.out.println("Prime Number");
        }
        boolean isPrime=true;
        while(num>div){
            if(num%div==0) {
                isPrime = false;
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
