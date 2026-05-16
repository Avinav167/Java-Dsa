package com.avi;
import java.util.Scanner;
public class decimal_binary {
    public static int decimalBinary(int n){
        int i=0;
        int bin=0;
        while(n>0){
            int n1=n%2;
            bin=(int) (bin+(n1*Math.pow(10,i)));
            i++;
            n=n/2;
        }
        return bin;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number decimal form:");
        int n=sc.nextInt();
        System.out.println("Binary form:"+decimalBinary(n));
    }
}
