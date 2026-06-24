package com.avi;
import java.util.Scanner;
public class natural {
    public static void NaturalNumber(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of natural number=" + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NaturalNumber(n);
    }
}