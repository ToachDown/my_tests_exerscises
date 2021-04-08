package com.Tchapter2;

import java.util.Arrays;
import java.util.Scanner;

public class chapter2_3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = 4 * i + i * i;
        }
        System.out.println(Arrays.toString(array));

        System.out.println("----------------");

        for(int j = 0; j < array.length; j++){
            int value = array[j];
            search(value,j,array);
        }

        System.out.println(Arrays.toString(array));

    }

    static void search(int value, int j,int[] array){
        int i = j-1;
        for(; i >=0; i--){
            if(value > array[i]){
                array[i+1] = array[i];
            } else {
                break;
            }
        }
        array[i + 1] = value;
    }
}