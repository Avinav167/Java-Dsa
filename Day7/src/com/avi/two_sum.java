package com.avi;

public class two_sum {
    public static void Sumtwo(int num[],int key){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                int sum=num[i]+num[j];
                if(sum==key){
                    System.out.print("["+i+","+j+"]");
                }
            }
        }
    }
    public static void main(String[] args){
        int num[]={2,7,11,15};
        int key=9;
        Sumtwo(num,key);
    }
}
