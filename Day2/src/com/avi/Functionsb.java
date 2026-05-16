package com.avi;
import java.util.Scanner;
public class Functionsb {
    public static void printHelloWorld(){
        System.out.println("Hello World:");
    }
    public static int calculateSum(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        printHelloWorld();
        System.out.println("Enter the Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a,b);
        System.out.println("Enter the Number:"+sum);
    }
}
