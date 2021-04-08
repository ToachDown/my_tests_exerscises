package com.Tchapter3;

import java.util.Scanner;

public class chapter3_2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        chapter3_2_10 core = new chapter3_2_10();
        String str = input.nextLine();
        core.counter(str);
    }

    public void counter(String str){
        String[] result = str.split("\\.|\\?|\\!");
        System.out.println(result.length);
    }
}
