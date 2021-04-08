package com.Tchapter2;

import java.util.Arrays;
import java.util.Scanner;

public class chapter2_3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int[] arrayOne = new int[N + M];
        int[] arrayTwo = new int[M];
        for (int i = 0; i < N; i++) {
            arrayOne[i] = 4 * i + i * i;
            System.out.println("x[" + i + "] = " + arrayOne[i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < M; i++) {
            arrayTwo[i] = 6 * i + i * i;
            System.out.println("x[" + i + "] = " + arrayTwo[i]);
        }
        System.out.println("----------------");

        for (int i = 0; i < M; i++) { // цикл сортировки
            for (int j = 0; j < (N + M); j++) {
                if (arrayTwo[i] < arrayOne[j] && j < N+i) {
                    for (int m = 0; m < (N - j + i); m++) {
                        arrayOne[N + i - m] = arrayOne[N - 1 + i - m];
                    }
                    System.out.println("number replace is " + j );
                    break;
                } else if(j >= N+i){
                    System.out.println("number replace is " + (N+i));
                    break;
                }
            }
        }
    }
}
