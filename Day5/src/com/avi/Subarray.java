package com.avi;
import java.util.*;
public class Subarray {
    public static void printSubArray(int num[]){
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num[]={2,4,6,8,10};
        printSubArray(num);
    }
}
