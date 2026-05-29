package com.avi;
import java.util.Scanner;
public class perfect_Square {
    public static boolean perfectSqr(int num){
        int start=0;
        int end=num;
        while(start<=end){
            int mid=start+(end-start)/2;
            int square=mid *mid;
            if(square==mid){
                return true;
            }
            if(square>mid){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Perfect Square:"+perfectSqr(num));
    }
}
