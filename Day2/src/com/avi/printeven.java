package com.avi;
import java.util.Scanner;
public class printeven {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        for(int i=9;i<=n;i++){
            int val=i;
            if(val%2==0){
                System.out.println(val);
            }
        }
    }
}
