package com.Tchapter3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class chapter3_2_7 {
    public static void main(String[] args){
        chapter3_2_7 core = new chapter3_2_7();
        String str1 = "informatika";
        String str2 = "tort";
        core.create(str1 , str2);
    }

    public void create(String info, String tort){
        char[] inform = info.toCharArray();
        String result = "";
        int m = 0;
        char[] tor = tort.toCharArray();
        int[] numb = new int[tort.length()];
        for(int i = 0; i < tor.length; i++){
            for(int j = 0; j < inform.length;j++){
                if(tor[i] == inform[j]){
                    numb[m] = j;
                    m++;
                }
            }
        }
        System.out.println(Arrays.toString(numb));
        for(int i = 0; i < numb.length; i++) {
            result = result.concat(String.valueOf(inform[numb[i]]));
        }
        System.out.println(result);
    }
}
