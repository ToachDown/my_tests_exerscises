package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter array size N");
        int N = input.nextInt();
        double[] array = new double[N];
        double min;
        double max;
        double temp;
        int minId = 0;
        int maxId = 0;

        for(int i = 0; i< N; i++){
            System.out.println("array[" + i + "] = ");
            array[i] = input.nextDouble();
        }

        min = array[0];
        max = array[0];

        for(int i = 0; i < N-1;i++){
            if(min > array[i+1]){
                minId = i+1;
            }
            if(max < array[i+1]){
                maxId = i+1;
            }
        }

        temp = array[minId];
        array[minId] = array[maxId];
        array[maxId] = temp;

        for (int i = 0; i< array.length;i++){
            System.out.println("array[" + array[i] + "]");
        }
    }
}
