package com.avi;
import java.util.Scanner;
public class Palindrome {
    public static boolean checkPalindrome(int n) {
        int rev = 0;
        int ld=0;
        int i=n;
        while (n > 0) {
            ld = n % 10;
            rev = (rev * 10) + ld;
            n = n / 10;
        }
//        System.out.println(n);
        if(rev == i) {
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        int n=121;
        System.out.println("Palindrome number:"+checkPalindrome(n));
    }
}