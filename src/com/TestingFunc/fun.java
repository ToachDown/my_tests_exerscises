package com.TestingFunc;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class fun {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 5;
        Consumer<Integer> consumer = x -> System.out.println(x);
        MyPredicate<Integer> myPredicate = x -> System.out.println(x);
        myPredicate.apply(6);
    }
}

interface MyPredicate<T>{
    void apply(T t);
}
