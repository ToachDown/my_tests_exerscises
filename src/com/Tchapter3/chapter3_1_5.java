package com.Tchapter3;

import java.util.Arrays;
import java.util.Scanner;

public class chapter3_1_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        chapter3_1_5 core = new chapter3_1_5();
        String str = input.nextLine();
        core.redact(str);
    }

    public void redact(String str){
        str = str.trim();
        int count = 0;
        char temp;
        char[] array = str.toCharArray();
        for(int i = 0;i < array.length-1;i++){
            if(Character.isWhitespace(array[i]) && Character.isWhitespace(array[i+1])) {
                while (Character.isWhitespace(array[i]) && Character.isWhitespace(array[i + 1])) {
                    int j = 0;
                    for (; j < array.length - 1 - i; j++) {
                        array[i + j] = array[i + j + 1];
                    }
                    array[i + j - count] = ' ';
                    count++;
                }
            }
        }
        System.out.println(array);
    }
}
