package com.samplepage.Relevel.AnjaliJava;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        int[] arr = {10,4,7,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Index");
        int index = sc.nextInt();

        try {
            System.out.println("Value at index: " + index + " is "+ arr[index]);
        }catch (ArrayIndexOutOfBoundsException exception){
            throw new ArrayIndexOutOfBoundsException("out of bounds Exception");
        }
        finally {
            System.out.println("Length Of the array: "+arr.length);
        }
            }
}
