package com.avi;

public class evenfind {
    public static int findNumbers(int num[]){
        int s=0;
        for(int i=0;i<num.length;i++){

            if((num[i]>9 && num[i]<=99)  || (num[i]>999 && num[i]<10000)||num[i]==100000){
                s++;
            }
        }
        return s;
    }
    public static int findnum(int num[]){

        int s=0;
        for(int i=0;i<num.length;i++){
            int c=0;
            while(num[i]>0){
                num[i]=num[i]/10;
                c++;
            }
            if(c%2==0){
                s++;
            }
        }
        return s;

    }
    public static void main(String args[]){
        int nums[]={555,901,482,177123};
//        System.out.println(findNumbers(nums));
        System.out.println(findnum(nums));
        int n=2;
        n=n%10;
        System.out.println(n);
    }
}
