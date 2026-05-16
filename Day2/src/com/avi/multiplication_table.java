package com.avi;
import java.util.Scanner;
public class multiplication_table {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
        int val=1;
        System.out.println("Enter the number to find the table of it");
        int num=sc.nextInt();
        for(int i=1;i<=n;i++){
            val=num*i;
            System.out.println(num+"x"+i+"="+val);
        }
    }
}
