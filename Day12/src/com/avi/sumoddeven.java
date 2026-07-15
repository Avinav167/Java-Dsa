package com.avi;
import java.util.Scanner;
public class sumoddeven {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int oddsum=0;
        int evensum=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the number");
            int num=sc.nextInt();
            if(n%2==0){
                evensum=evensum+num;
            }
            else{
                oddsum=oddsum+num;
            }
        }
        System.out.println("Even Number:"+evensum);
        System.out.println("Odd Number"+oddsum);
    }
}
