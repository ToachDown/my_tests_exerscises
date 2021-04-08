package com.testing_Thead;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class newThread {
    public static void main(String... args) throws Exception {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Processor available: " + cores);
        ExecutorService service = Executors.newFixedThreadPool(3);

        List<Future> futures = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            service.submit(new MyThreads("t#" + i));
        }

        for(Future f : futures){
            System.out.println("result = " + f.get());
        }
    }
}

class MyThreads extends Thread{
    private String name;
    public MyThreads(String n){
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
