package com.avi;
import java.util.Scanner;
public class optimised_prime {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Number to check whether it is a Prime Number or not");
//        int n=sc.nextInt();
//        boolean prime=isPrime(n);
//        System.out.println("It is Prime:"+prime);
        primeRange(20);
    }
}
