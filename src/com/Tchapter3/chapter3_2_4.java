package com.Tchapter3;

import java.util.Scanner;

public class chapter3_2_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        chapter3_2_4 core = new chapter3_2_4();
        String str = input.nextLine();
        core.func(str);
    }

    public void func(String str){
        StringBuffer result = new StringBuffer(str);
        char[] array = str.toCharArray();
        int count = 0;
        for(int i = 0; i < array.length; i++){
            result.insert(i + count, array[i]);
            count++;
            System.out.println(result);
        }
        System.out.println(result.toString());
    }
}
