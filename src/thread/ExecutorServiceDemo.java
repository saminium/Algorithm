package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by szeru on 12/14/2018
 */
public class ExecutorServiceDemo {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3);



        ExecutorService services = Executors.newSingleThreadScheduledExecutor();



        List<Future> futureList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            futureList.add(service.submit(new RunnableTask()));
            futureList.add(service.submit(new CallableTask()));
        }

        futureList.forEach(future -> {
            try {

                    System.out.println(future.get());

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

    }

    static class CallableTask implements Callable<Integer> {
        @Override
        public Integer call(){
            return Math.abs(new Random().nextInt());
        }
    }

}

class RunnableTask implements Runnable{
    public void run(){
        System.out.println("Thread name : " + Thread.currentThread().getName());
    }
}


