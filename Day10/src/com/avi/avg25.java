package com.avi;
import java.util.Scanner;
public class avg25
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=25;i++){
            System.out.println("Score"+i+":");
            int score=sc.nextInt();
            sum=score+sum;
        }
        double average=(double) (sum/25);
        System.out.println("Average of 25 scores:"+average);
    }
}
