package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_11 {
    public static void main(String[] args) {
        chapter2_4_11 core = new chapter2_4_11();
        Scanner inPut = new Scanner(System.in);
        int N = inPut.nextInt();
        int M = inPut.nextInt();

        core.sravn(N,M);
    }

    public void sravn(int N, int M){
        if(countLenght(N) > countLenght(M)){
            System.out.println("in Number N more digits :" + countLenght(N));
        } else{
            System.out.println("in Number M more digits :" + countLenght(M));
        }
    }

    private int countLenght(int N){
        int i = 0;
        for(;N!=0;i++){
            N = N/10;
        }
        return i;
    }
}
