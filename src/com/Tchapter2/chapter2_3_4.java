package com.Tchapter2;

import java.util.Scanner;

public class chapter2_3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int count = 0;
        int temp;
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = 4 * i + i * i;
            System.out.println("x[" + i + "] = " + array[i]);
        }

        System.out.println("----------------");

        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N;j++){
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    count++;
                }
            }
        }

        for(int i = 0; i < N ; i++){
            System.out.println("x[" + i + "] = " + array[i]);
        }
        System.out.println(" count = " + count);
    }
}
