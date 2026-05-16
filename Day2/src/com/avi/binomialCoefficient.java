package com.avi;
import java.util.Scanner;
public class binomialCoefficient {
    public static int returnN(int n){
        int val=1;
        for(int i=0;i<n;i++){
            int num=n-i;
            val=val*num;
        }
        return val;
    }
    public static int returnR(int r){
        int val=1;
        for(int i=0;i<r;i++){
            int num=r-i;
            val=val*num;
        }
        return val;
    }
    public static int returnN_R(int nr){
        int val=1;
        for(int i=0;i<nr;i++){
            int num=nr-i;
            val=val*num;
        }
        return val;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int r1=sc.nextInt();
        int nr1=n1-r1;
        int binomialCoefficient=returnN(n1)/(returnR(r1)*returnN_R(nr1));
        System.out.println("Binomial Coefficient="+binomialCoefficient);

    }
}
