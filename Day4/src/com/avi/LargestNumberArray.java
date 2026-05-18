package com.avi;
import java.util.*;
public class LargestNumberArray {
    public static int getLargest(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num[]={1,2,6,3,5};
        int l=getLargest(num);
        System.out.println("Largest Number="+l);
    }
}
