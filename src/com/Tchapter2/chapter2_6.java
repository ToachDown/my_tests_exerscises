package com.Tchapter2;

import java.util.Scanner;

public class chapter2_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter array size N");
        int N = input.nextInt();
        double[] array = new double[N];
        double sum = 0;
        int count = 0;

        for(int i = 0; i< N; i++){
            System.out.println("array[" + i + "] = ");
            array[i] = input.nextDouble();
        }

        for (int i = 2; i < N; i++){
            count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if (count == 2){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
