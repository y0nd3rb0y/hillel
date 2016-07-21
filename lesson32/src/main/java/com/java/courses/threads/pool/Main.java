package com.java.courses.threads.pool;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        int cpus = rt.availableProcessors();

        ExecutorService service = Executors.newFixedThreadPool(cpus);
        service.execute(new SomeTask());
        service.execute(new SomeTask());
        service.execute(new SomeTask());
        service.shutdown();

        ExecutorService service2 = Executors.newFixedThreadPool(cpus);
        Future<Integer> result = service2.submit(new AnotherTask());
        int sum = result.get();
        System.out.println(sum);

    }


}

class SomeTask implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " - " + i);
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
    }
}

class AnotherTask implements Callable<Integer> {
    public Integer call() throws Exception{
        int sum =0;
        for (int i = 0; i < 10; i++) {
            try{
                Thread.sleep(10000);
                sum+=i;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
        return sum;
    }
}
