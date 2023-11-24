package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// isTerminated() checking on service results true if the task is completed and shutdown. If the task is still running
// after the shutdown call the isTerminated method will result false.

public class TaskTermination {
    public static int counter;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
//          service = Executors.newFixedThreadPool(8);
            Runnable task1 = () -> {
                for (int i = 0; i < 5; i++) {
                    counter++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted Exception");
                    }
                    System.out.println("Task1: " + counter);
                }
            };
            Runnable task2 = () -> {
                for (int i = 0; i < 5; i++) {
                    counter++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted Exception");
                    }
                    System.out.println("Task2: " + counter);
                }
            };
            Future<?> result1 = service.submit(task1);
            Future<?> result2 = service.submit(task2);

            System.out.println("----------------------------");
            System.out.println(result1.isDone());
            System.out.println(result2.isDone());
            System.out.println("----------------------------");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (service != null) {
                System.out.println(service.isShutdown());
                service.shutdown();
                System.out.println(service.isShutdown());
            }
        }
        //Thread.sleep(6000);
        service.awaitTermination(11, TimeUnit.SECONDS);
        System.out.println(service.isTerminated());
        System.out.println(service.isShutdown());
        if (service.isTerminated())
            System.out.println("Finished");
        else {
            System.out.println("Atleast one task running");
        }
    }
}