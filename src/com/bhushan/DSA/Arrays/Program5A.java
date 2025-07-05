package com.bhushan.DSA.Arrays;

//Insert the element at given position in an array
//If capacity is not there then dont insert
public class Program5A {
    public static void main(String[] args) {
       int arr[] ={10,2,34,53,56};

        int element = 99;
        int position = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        int []res = insert(arr,element,3);

        System.out.println("-------------------");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] +" ");
        }
    }

    public static int[] insert(int arr[], int element,int position){

        int index = position-1;
        int tempArr[] = new int[arr.length+1];
        System.out.println("size of array " +tempArr.length);
        int n= tempArr.length;
        for (int i = n-1; i > index; i--) {
            tempArr[i] = arr[i-1];
        }

        tempArr[index] = element;
        for (int i = 0; i < index; i++) {
            tempArr[i]=arr[i];
        }
        return tempArr;

    }
}
//time complexity O(n)
//space complexity O(n)