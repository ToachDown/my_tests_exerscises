package com.Tchapter2;

import java.util.Arrays;
import java.util.Scanner;

public class chapter2_4_10 {
    public static void main(String[] args) {
        chapter2_4_10 core = new chapter2_4_10();
        Scanner inPut = new Scanner(System.in);
        int N = inPut.nextInt();
        System.out.println(Arrays.toString(core.parse(N)));
    }

    public int[] parse(int N){
        int[] result = new int[0];
        int M = N;
        int i = 0;
        for(;M!=0;i++){
            M = M/10;
        }
        result = new int[i];
        for(int j = 0; N != 0;j++){
            result[i-j-1] = N%10;
            N/=10;
        }
        return result;
    }
}
