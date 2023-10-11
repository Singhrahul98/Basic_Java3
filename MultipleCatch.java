package com.samplepage.Relevel.AnjaliJava;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Index ");
        int index = sc.nextInt();
        System.out.println("Enter Number");
        int num = sc.nextInt();

        try {
            System.out.println("Result is: "+arr[index]/num);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exception message: "+ exception.getMessage());
        }catch (ArithmeticException exception){
            System.out.println("Exception Message: "+exception.getMessage());
        }
    }
}
