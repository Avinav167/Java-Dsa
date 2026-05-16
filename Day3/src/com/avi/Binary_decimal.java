package com.avi;
import java.util.Scanner;
public class Binary_decimal {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int val2=0;
        int i=0;
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        while(n>0){
            int n1=n%10;
            val2=(int) (val2+(n1*Math.pow(2,i)));
            n=n/10;
            i++;
        }
        System.out.println("Decimal Number:"+val2);
    }
}
