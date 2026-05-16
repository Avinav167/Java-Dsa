package com.avi;
import java.util.Scanner;
public class advancePattern {
    public static void hollowPattern(int totrow,int totcol ){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=totcol;j++){
                if(i==1 || i==totrow || j==1 || j==totcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void invertedTriangle(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void invertedHalfPyramidNo(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    public static void floyedsTriangle(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println(" ");
        }
    }
    public static void zeroOneTriangle(int n){
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                k=i+j;
                if(k%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        hollowPattern(4,5);
        invertedTriangle(4);
        invertedHalfPyramidNo(5);
        floyedsTriangle(5);
        zeroOneTriangle(5);
    }
}
