package com.avi;

public class reverserev {
    public static void reverseArray(int n[]){
        int start=0;
        int end=n.length-1;
        int rev;
        while(start<=end) {
            rev = n[end];
            n[end] = n[start];
            n[start] = rev;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int n[]={1,2,3,4,5,6,7,8};
        reverseArray(n);
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
}
