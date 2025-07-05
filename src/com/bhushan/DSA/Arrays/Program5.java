package com.bhushan.DSA.Arrays;

//Insert the element at given position in an array
//If capacity is not there then dont insert
public class Program5 {
    public static void main(String[] args) {
        int arr[] = new int[7];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int element = 99;
        int position = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        int res = insert(arr,element,3);

        System.out.println("-------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public static int insert(int arr[], int element,int position){

        int n= arr.length;
        System.out.println("size of array " +n);
        int index = position-1;
        for (int i = n-1; i > index; i--) {
           arr[i] = arr[i-1];
        }

        arr[index] = element;
        return n+1;

    }
}
//time complexity O(n)
//space complexity O(1)