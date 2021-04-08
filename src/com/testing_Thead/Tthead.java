package com.testing_Thead;

import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Tthead {
    public static void main(String... args) {
        MyThread thread = new MyThread("one");
        thread.start();
        Scanner input = new Scanner(System.in);
        input.next();
        thread.interrupt();
    }
}

class MyThread extends Thread{
    private String name;
    public MyThread(String n){
        this.name = n;
    }
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                System.out.println("Thread::stop");
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

