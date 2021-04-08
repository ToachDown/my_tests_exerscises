package com.Tchapter3;

import java.util.Scanner;

public class chapter3_2_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        chapter3_2_1 core = new chapter3_2_1();
        String str = input.nextLine();
        core.count(str);
    }

    public void count(String str){
        int count = 0;
        int whitespace = 0;
        char[] array = str.toCharArray();
        for(int i = 0; i < array.length;i++){
            if(Character.isWhitespace(array[i])){
                count++;
            } else if(!Character.isWhitespace(array[i]) && whitespace < count){
                    whitespace = count;
                    count = 0;
            }
        }
        System.out.println(whitespace);
    }
}
