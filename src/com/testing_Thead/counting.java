package com.testing_Thead;

import java.util.HashSet;
import java.util.Set;

public class counting {
    public static void main(String[] args) {
        Myclass m1 = new Myclass(1L, "name");
        Myclass m2 = new Myclass(1L, "name");
        if(m1.equals(m2)){
            System.out.println("OK");
            System.out.println(m1.hashCode());
            System.out.println(m2.hashCode());
        }

        Set<Myclass> set = new HashSet<>();
        set.add(m1);
        set.add(m2);
        System.out.println(set.size());
    }
}
