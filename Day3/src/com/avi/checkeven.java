package com.avi;
import java.util.Scanner;
public class checkeven {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("It is Even:"+isEven(n));
    }
}
