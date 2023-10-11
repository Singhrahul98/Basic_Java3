package com.samplepage.Relevel.AnjaliJava;

public class CustomSample {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
            throw new CustomExceptionEx("This is a custom Exception  Example");
        }catch (Exception ex){
            System.out.println("Catch block");
            System.out.println("Exception message :"+ex.getMessage());
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
