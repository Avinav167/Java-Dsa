package com.avi;
import java.util.Scanner;
public class Linearrev {
    public static int linearSearch(int n[],int key){
        for(int i=0;i<=n.length;i++){
            if(n[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int key=8;
        int n[]={1,2,3,5,6,7,8};
        int index=linearSearch(n,key);
        if(index==-1){
            System.out.println("Index Not Found");
        }
        else{
            System.out.println("Index at:"+index);
        }
    }
}
