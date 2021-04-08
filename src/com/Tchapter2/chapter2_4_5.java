package com.Tchapter2;

import java.util.Arrays;
import java.util.Scanner;

public class chapter2_4_5 {
    public static void main(String[] args) {
        chapter2_4_5 core = new chapter2_4_5();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array = new int[N];

        core.input(array,N);
        System.out.println(core.search(array,N));
    }

    public int search(int[] array, int N){
        int max = array[0];
        int max2 = array[1];
        int maxId;
        for(int i = 1; i < N; i++){
            if(max < array[i]){
                max = array[i];
                if(max2 < max && max < array[i+1])
                max2 = array[i+1];
            }
        }
        return  max2;
    }

    public void input(int[] array,int N){
        for(int i = 0; i < N; i++){
            array[i] = (int)(Math.random()*50);
        }
    }
}
