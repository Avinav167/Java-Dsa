package com.avi;
import java.util.*;
public class square_root {
    public static int sqrRoot(int n) {
        int start = 0;
        int end = n;
        if (n == 0 || n == 1) {
            return n;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;
            if (square == n) {
                return mid;
            }
            if (square > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find the square root of it:");
        int n = sc.nextInt();
        System.out.println("Square_root:" + sqrRoot(n));
    }
}