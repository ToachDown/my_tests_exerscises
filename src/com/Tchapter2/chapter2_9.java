package com.Tchapter2;

import java.util.Scanner;

public class chapter2_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter array size N");
        int N = input.nextInt();
        int[] array = new int[N];
        int result;
        int demoSet;
        int set = 0;

        for(int i = 0; i< N; i++){
            System.out.println("array[" + i + "] = ");
            array[i] = input.nextInt();
        }

        result = array[0];

        for(int i = 0; i < N; i++){
            demoSet = 0;
            for(int j = 0; j < N ; j++) {
                if (array[i] == array[j]) {
                    demoSet++;
                }
            }
            if((demoSet >= 2) && (demoSet >= set) && (array[i] <= result)){
                set = demoSet;
                result = array[i];
            }
        }

        System.out.println(result);
    }
}
