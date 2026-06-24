package com.avi;
import java.util.Scanner;
public class reverse {
    public static int reverseNumber(int n){
        int rev=0;
        int ld=0;
        while(n>0){
            ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();;
        System.out.println("Reverse of a Number:"+reverseNumber(n));
    }
}
