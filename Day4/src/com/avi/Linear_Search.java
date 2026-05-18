package com.avi;
import java.util.Scanner;
public class Linear_Search {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key=10;
        int index=linearSearch(number,key);
        if(index==-1){
            System.out.println("Not found");

        }
        else{
            System.out.println("Key is at Index of:"+index);
        }

    }
}
