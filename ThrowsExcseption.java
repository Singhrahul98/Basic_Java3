package com.samplepage.Relevel.AnjaliJava;

public class ThrowsExcseption {
    public static void printElemnt (int[] arr, int index) throws ArrayIndexOutOfBoundsException{
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        int[] arr = {10,2,3,7};
        try {
            printElemnt(arr,10);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }

    }
}
