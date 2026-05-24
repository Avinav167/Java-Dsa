package com.avi;
import java.util.Scanner;
public class revison {
    public static int linear(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(key==num[i]){
                return i;
            }
        }
        return -1;
    }
    public static int largestArray(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;
    }
    public static int Binary(int num[],int key){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void Reverse(int num[]){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int temp=num[end];
            num[end]=num[start];
            num[start]=temp;
            start++;
            end--;
        }
    }
    public static void Pair(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void subarray(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
//        int num[]={2,4,6,8,10,12,14};
//        System.out.println("Enter the key");
//        int key=4;
//        System.out.println("Index at:"+linear(num,key));
//        int num2[]={1,2,6,3,5};
//        System.out.println("Largest Value="+largestArray(num2));
//        int num3[]={2,4,5,6,7,8};
//        int key2=6;
//        System.out.println("Index at:"+Binary(num3,key2));
//        int num[]={2,4,6,8,10,12};
//        Reverse(num);
//        for(int i=0;i<num.length;i++){
//            System.out.print(num[i]+" ");
//        }
//        System.out.println();
        int num[]={2,4,6,8,10};
        subarray(num);
    }
}
