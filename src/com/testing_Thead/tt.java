package com.testing_Thead;

import java.util.concurrent.Semaphore;

public class tt {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1);
        new Philosopher(sem,"Сократ").start();
        new Philosopher(sem,"Платон").start();
        new Philosopher(sem,"Аристотель").start();
        new Philosopher(sem,"Фалес").start();
        new Philosopher(sem,"Пифагор").start();
    }
}
