package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_13 {
    public static void main(String[] args) {
        chapter2_4_13 core = new chapter2_4_13();
        Scanner input = new Scanner(System.in);
        System.out.println("print N > 2 :");
        int N = input.nextInt();
        int[] array;

        array = core.initialization(N);
        core.search(array,N);
    }

    public void search(int[] array, int N){
        for(int i = 0; i < array.length-2;i++){
            System.out.println("number one is " + array[i] + " number two is " + array[i+2]);
        }
    }

    public int[] initialization(int N){
        int[] result = new int[2*N - N];
        int j = 0;
        for(int i = N; i < 2*N; i++){
            result[j] = i;
            j++;
        }
        return result;
    }
}
