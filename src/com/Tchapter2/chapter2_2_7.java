package com.Tchapter2;

import java.util.Scanner;

public class chapter2_2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] array;
        int N = input.nextInt();
        array = new double[N][N];
        chapter2_2_7 core = new chapter2_2_7();
        core.fillArray(array,N);
        core.outputArray(array,N);

    }

    public void outputArray(double[][] arr,int N){
        for(int i = 0; i < N;i++){
            for(int j = 0; j < N;j++){
                System.out.println("x[" + i + "][" + j + "] = " + arr[i][j] + "    ");
            }
        }
    }

    public double[][] fillArray(double[][] arr,int N){
        int plus = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = Math.sin(((i*i)-(j*j))/N);
                if(arr[i][j] > 0){
                    plus++;
                }
            }
        }
        System.out.println(" + = " + plus);
        return arr;
    }
}
