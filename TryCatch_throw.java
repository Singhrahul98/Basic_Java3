package com.samplepage.Relevel.AnjaliJava;


public class TryCatch_throw {
    public static void printElement (int[] arr, int index){
        if (index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("Index is equal to or greater than the length of the array");
            }
        System.out.println(arr[index]);
        }

    public static void main(String[] args) {
        int[] arr = {10,22,3,8,7};
        try {
            printElement(arr,10);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }

    }
}



