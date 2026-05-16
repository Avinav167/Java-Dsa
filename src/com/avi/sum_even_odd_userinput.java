package com.avi;
import java.util.Scanner;
public class sum_even_odd_userinput {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int evensum=0;
        int oddsum=0;
        System.out.println("The range:");
        int n=sc.nextInt();
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%2==0){
                evensum=evensum+num;
            }
            else{
                oddsum=oddsum+num;
            }
        }
        System.out.println("Sum of even numbers:"+evensum);
        System.out.println("Sum of odd numbers:"+oddsum);
    }
}
