package com.Tchapter2;

import java.util.Arrays;
import java.util.Scanner;

public class chapter2_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int[] arrayOne = new int[N + M];
        int[] arrayTwo = new int[M + N];
        for(int i = 0; i < N; i++){
            arrayOne[i] = 4*i+i*i;
            System.out.println("x[" + i + "] = " + arrayOne[i]);
        }
        System.out.println("----------------");
        for(int i = 0; i < M; i++){
            arrayTwo[i] = 6*i+i*i;
            System.out.println("x[" + i + "] = " + arrayTwo[i]);
        }
        System.out.println("----------------");

        if(N > M) {
            for (int i = 0; i < M; i++) { // цикл сортировки
                for (int j = 0; j < (N + i); j++) {
                    if (arrayTwo[i] < arrayOne[j]) {
                        for (int m = 0; m < (N - j + i); m++) {
                            arrayOne[N + i - m] = arrayOne[N - 1 + i - m];
                        }
                        arrayOne[j] = arrayTwo[i];
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(arrayOne));
        } else if (M > N){
            for (int i = 0; i < N; i++) { // цикл сортировки
                for (int j = 0; j < (M + i); j++) {
                    if (arrayOne[i] < arrayTwo[j]) {
                        for (int m = 0; m < (M - j + i); m++) {
                            arrayTwo[M + i - m] = arrayTwo[M - 1 + i - m];
                        }
                        arrayTwo[j] = arrayOne[i];
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(arrayTwo));
        }
    }
}
