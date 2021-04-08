package com.Tchapter2;

import java.util.Scanner;

public class chapter2_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter array size N");
        int N = input.nextInt();
        int[] array = new int[N];
        int counterPlus = 0;
        int counterMinus = 0;
        int counterZero = 0;

        for(int i = 0; i< N; i++){
            System.out.println("array[" + i + "] = ");
            array[i] = input.nextInt();
        }

        for(int i = 0; i < N; i++){
            if (array[i] > 0){
                counterPlus++;
            } else if(array[i] == 0){
                counterZero++;
            } else {
                counterMinus++;
            }
        }

        System.out.println(" plus = " + counterPlus + "\n minus = " + counterMinus + "\n zero = " + counterZero);

    }
}
