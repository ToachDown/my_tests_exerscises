package com.Tchapter3;

import java.util.Scanner;

public class chapter3_2_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        chapter3_2_5 core = new chapter3_2_5();
        String str = input.nextLine();
        core.func(str);
    }

    public void func(String str){
        str = str.replaceAll("\\s","");
        StringBuilder strok = new StringBuilder();
        int res;
        for(int i = 0; i < str.length(); i++){
            char pre = str.charAt(i);
            res = str.indexOf(pre, i+1);
            if(res == -1){
                strok.append(pre);
            }
        }
        System.out.println(strok.toString());
    }
}
