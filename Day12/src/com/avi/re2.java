package com.avi;
import java.util.Scanner;
public class re2 {
    public static int naturalNumber(int n){
        int val=0;
        for(int i=0;i<n;i++){
            val=val+i;
        }
        return val;
    }
    public static int reverseNumber(int n){
        int reverse=0;
        int div=0;
        while(n>0){
            div=n%10;
            reverse=(reverse*10)+div;
            n=n/10;
        }
        return reverse;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int natural=naturalNumber(num);
        int reverse=reverseNumber(num);
        System.out.println("Reverse Number:"+reverse);
        System.out.println("Natural Number:"+natural);

    }
}
