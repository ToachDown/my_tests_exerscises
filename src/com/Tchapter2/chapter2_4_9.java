package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_9 {
    public static void main(String[] args) {
        chapter2_4_9 core = new chapter2_4_9();
        Scanner inPut = new Scanner(System.in);
        int A = inPut.nextInt();
        int B = inPut.nextInt();
        int C = inPut.nextInt();
        int D = inPut.nextInt();

        core.square(A,B,C,D);
    }

    public void square(int A,int B, int C, int D){
        double result = 0;
        result = 0.5 * (A*B + C*D*(Math.sin(alfa(A,B,C,D))));
        System.out.println(result);
    }

    private double alfa(int A,int B, int C,int D){
        double result;
        result = Math.acos((-0.5)*(A*A+B*B-C*C-D*D)*(1/(C*D)));
        return result;
    }
}
