package com.Tchapter2;

import java.util.Scanner;

public class chapter2_4_1 {
    public static void main(String[] args) {
        chapter2_4_1 core = new chapter2_4_1();
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        System.out.println(core.HOD(A,B));
        System.out.println(core.NOK(A,B));
    }

    public int NOK(int A,int B){
        int result;
        result = (A*B)/HOD(A,B);
        return result;
    }

    public int HOD(int A, int B){
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
