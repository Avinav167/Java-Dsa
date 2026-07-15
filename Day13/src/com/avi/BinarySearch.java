package com.avi;

public class BinarySearch {
    public static int binarySearch(int n[],int key){
        int start=0;
        int end=n.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(n[mid]==key){
                return mid;
            }
            else if(n[mid]>=key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int n[]={1,2,3,4,5,6,7,8,9,10};
        int key=5;
        int index=binarySearch(n,key);
        if(index==-1){
            System.out.println("Index Not Found");
        }
        else{
            System.out.println("Index at :"+index);
        }
    }
}
