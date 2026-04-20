package com.avi;
import java.util.Scanner;
public class reverse_number {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int ld=0;
        int rev=0;
//        In this method we cannot to store the value of reversed number therefore we will use another method
//        while(n>0){
//            rev=n%10;
//            System.out.print(rev);
//            n=n/10;
//        }
//        Now in this method we will store the reversed number for future purpose
        while(n>0){
            ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        System.out.print("Reverse:"+rev);
    }
}
