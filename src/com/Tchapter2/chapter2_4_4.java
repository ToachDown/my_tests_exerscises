package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_4 {
    public static void main(String[] args) {
        chapter2_4_4 core = new chapter2_4_4();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] res;
        int[][] tochka = new int[N][2];

        core.input(tochka, N);
        res = core.max(tochka, N);
        System.out.println("before tochek A " + res[0] + " and  A " + res[1]);
    }

    public int[] max(int[][] tochka, int N){
        double max;
        int[][] source = new int[2][2];
        int[] res = new int[2];
        source[0] = tochka[0];
        source[1] = tochka[1];
        max = module(source);

        for(int i = 2; i < N; i+=2){
            for(int j = 3; j < N;j+=2){
                double mod;
                source[0] = tochka[i];
                source[1] = tochka[j];
                mod = module(source);
                if(max < mod){
                    max = mod;
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        System.out.println(max);
        return res;
    }

    private double module(int[][] tochka1){
        double result;
        int[] temp = new int[2];

        temp[0] = tochka1[0][0] - tochka1[1][0];
        temp[1] = tochka1[0][1] - tochka1[1][1];

        result = Math.sqrt(temp[0]*temp[0] + temp[1]*temp[1]);
        return result;
    }

    public void input(int[][] tochka,int N){
        for (int i = 0; i < N; i++){
            tochka[i][0] = (int)(Math.random()*30);
            tochka[i][1] = (int)(Math.random()*30);
        }
    }
}
