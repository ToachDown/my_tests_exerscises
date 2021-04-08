package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_2 {
    public static void main(String[] args) {
        chapter2_4_2 core = new chapter2_4_2();
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        System.out.println(core.HOD(A,B,C,D));
    }

    public int HOD(int A, int B, int C, int D){
        int result;
        result = hHOD(hHOD(A,B),hHOD(C,D));
        return result;
    }

    private int hHOD(int A, int B){
        while(A != 0 && B != 0){
            if(A > B){
                A = A % B;
            } else{
                B = B % A;
            }
        }
        return A+B;
    }
}
