package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int k = 0;
        int N = input.nextInt();
        array = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if((j < k) || (j > N-k-1)){
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
            if(i < (N/2)-1) {
                k++;
            } else if(i == (N/2)-1){
            } else {
                k--;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("x[" + i + "][" + j + "] = " + array[i][j] + "    ");
            }
        }
    }
}
