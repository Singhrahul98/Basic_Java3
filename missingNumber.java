package com.samplepage.Relevel.AnjaliJava;

public class missingNumber {
    public static void main(String[] args) {
        int [] arr = {2,3,5,6,7,8,9};
        int start = arr[0];
        int len = arr.length;
        int end = arr[len-1];

        int sum = 0;
        //Sum of all Value
        for (int i=start; i <=end; i++ ){
            sum += i;
        }

        //Iterate the number
        for (int i = 0; i<len; i++){
            sum -= arr[i];
        }

        System.out.println("Missing value: "+ sum);
    }


}
