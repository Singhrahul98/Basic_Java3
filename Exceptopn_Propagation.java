package com.samplepage.Relevel.AnjaliJava;

public class Exceptopn_Propagation {
    //main->method1->method2->method3->method4

    public static void  method1(){
        System.out.println("Start of method 1");
        method2();
        System.out.println("End of method 1");
    }

    public static void method2(){
        System.out.println("Start method 2");
        try {
            method3();
        }catch (Exception exception){
            System.out.println("Exception message :"+exception.getMessage());
        }

        System.out.println("End of method 2");
    }
    public static void method3(){
        System.out.println("Start of method 3");
        method4();
        System.out.println("End of method 3");

    }

    public static void method4(){
        //method 4 is not handled exception so it will propagated previous one
        System.out.println("Start of method 4");
        int num1 = 10; int num2 = 0;
        System.out.println(num1/num2);
        System.out.println("end of the method 4");

    }
    public static void main(String[] args) {
        System.out.println("Start of main method");
        method1();
        System.out.println("End of the main method");
    }
}
