package com.samplepage.Relevel.AnjaliJava;

import java.util.Scanner;

public class tryCatch1 {
    public static void main(String[] args) {
        String message = "Rahul";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the index");
        int index = sc.nextInt();


        try {
            System.out.println("Value at index :"+ index + " is "+ message.charAt(index));
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println("Exception Caught :"+exception.getMessage());
        }

    }
}
