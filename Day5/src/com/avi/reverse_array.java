package com.avi;
import java.util.*;
public class reverse_array {
    public static void reverseArray(int num[]){
        int start=0;
        int end=num.length-1;
        while(start<end){
            int temp=num[end];
            num[end]=num[start];
            num[start]=temp;
            start++;
            end--;
        }
    }
    public static void reverse(int num1[]){
        int end=num1.length-1;
        for(int i=0;i<num1.length/2;i++){
            int temp1=num1[end];
            num1[end]=num1[i];
            num1[i]=temp1;
//            num1[i]++;
            end--;
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num[]={2,4,6,8,10};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println(" ");
    }
}
