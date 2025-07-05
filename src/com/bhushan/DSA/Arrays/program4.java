package com.bhushan.DSA.Arrays;

public class program4 {
    public static void main(String[] args) {
        int []arr= {10,23,45,65,74,98};
        int element= 25;
         int index = linerarSearch(arr,element);
        System.out.println(index);

    }

    public static int linerarSearch(int[] arr,int element){
        int n =arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}

//time complexity O(n)
//space complexity O(1)