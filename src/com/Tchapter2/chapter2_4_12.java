package com.Tchapter2;

import java.util.Arrays;
import java.util.Scanner;

public class chapter2_4_12 {
    public static void main(String[] args) {
        chapter2_4_12 core = new chapter2_4_12();
        Scanner inPut = new Scanner(System.in);
        int K = inPut.nextInt();
        int N = inPut.nextInt();

        core.func(K,N);
    }

    public void func(int K,int N){
        int[] result = new int[N];
        int m = 0;
        for(int i = 1; i < N;i++){
            int sum = 0;
            for(int j = i; j != 0;){
                sum += j%10;
                j/=10;
            }
            if(sum == K){
                result[m] = i;
                m++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
