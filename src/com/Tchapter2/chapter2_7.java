package com.Tchapter2;

import java.util.Scanner;

public class chapter2_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter array size N");
        int N = input.nextInt();
        double[] array = new double[N];
        double max = 0;

        for(int i = 0; i< N; i++){
            System.out.println("array[" + i + "] = ");
            array[i] = input.nextDouble();
        }

        max = array[0] + array[1];

        for(int i = 2; i < N-1; i+=2){
            if(max < (array[i] + array[i+1])){
                max = (array[i] + array[i+1]);
            }
        }

        System.out.println(max);
    }
}
