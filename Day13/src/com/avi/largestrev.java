package com.avi;

public class largestrev {
    public static int largestNumber(int n[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(largest<=n[i]) {
                largest=n[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int n[]={1,2,5,8,9};
        int largest=largestNumber(n);
        System.out.println("The largest number:"+largest);
    }
}
