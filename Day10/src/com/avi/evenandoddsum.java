package com.avi;
import java.util.Scanner;
public class evenandoddsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the sum of odd and even");
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        for(int i=1;i<=n;i++){
//            int n2=i;
            if(i%2==0){
                evensum=i+evensum;
            }
            else{
                oddsum=i+oddsum;
            }
        }
        System.out.println("Sum of Even Number:"+evensum);
        System.out.println("Sum of Odd Number:"+oddsum);
    }
}
