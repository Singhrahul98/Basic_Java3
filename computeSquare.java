package com.samplepage.Relevel.AnjaliJava;

import java.util.Scanner;

public class computeSquare {

    public static int lhsCompute (int a, int b){
        return (int)Math.pow((a+b), 2);
    }

    public static int rhsCompute (int a, int b){
        return (int) (Math.pow(a,2) + Math.pow(b,2) + 2*a*b);
    }

    public static void main(String[] args) {
        int a = 2; int b = 5;
        System.out.println("LHS " +lhsCompute(a,b));
        System.out.println("RHS "+rhsCompute(a,b));

        if (lhsCompute(a,b) == rhsCompute(a,b)){
            System.out.println("R.H.S = L.H.S");
        }else {
            System.out.println("R.H.S |= L.H.S.");
        }

        //**************Mathematical table Print___________________
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num + "*" + i + "="+ (num*i));
        }
    }
}
