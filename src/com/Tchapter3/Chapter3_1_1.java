package com.Tchapter3;

import java.util.Scanner;

public class Chapter3_1_1 {
    public static void main(String[] args){
        Chapter3_1_1 core = new Chapter3_1_1();
        String str = "camelCase";
        core.replace(str);
    }

    public void replace(String str){
        char[] array = str.toCharArray();
        String result;
        for(int i = 0;i < array.length;i++){
            String temp = Character.toString(array[i]);
            String temp1 = Character.toString(array[i]).toLowerCase();
            if(!temp.equals(temp1)){
                result = str.substring(0, i).concat("_").concat((str.substring(i, array.length)).toLowerCase());
                System.out.println(result);
            }
        }

    }
}
