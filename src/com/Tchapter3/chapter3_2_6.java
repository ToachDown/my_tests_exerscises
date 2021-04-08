package com.Tchapter3;

import java.util.Scanner;

public class chapter3_2_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        chapter3_2_6 core = new chapter3_2_6();
        String str = input.nextLine();
        core.func(str);
    }

    public void func(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char pre = str.charAt(i);
            if(pre == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
