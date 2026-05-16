package com.avi;
import java.util.Scanner;
public class factorial {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int val=1;
        for(int i=0;i<n;i++){
            int num=n-i;
            val=num*val;
        }
        System.out.println("Factorial="+val);
    }
}
