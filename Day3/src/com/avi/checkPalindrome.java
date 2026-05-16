package com.avi;
import java.util.Scanner;
public class checkPalindrome {
    public static void isPalindrome(int n){
        int rem=0;
        int rev=0;
        int i=n;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println(rev);
        if(rev==i){
            System.out.println("It is a Palindrome number");
        }
        else{
            System.out.println("It is not a Palindrome number");
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n1=sc.nextInt();
        isPalindrome(n1);
    }
}
