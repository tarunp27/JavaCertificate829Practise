package MultiThread;

//future submit (runnable) does not return any value its a runnable but still returns a future instance

import java.util.concurrent.*;

public class CheckValues {
   private static int counter = 0;

    public static void main(String[] args) throws ExecutionException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Runnable task1 = () ->
            {
                for (int i = 0; i < 5; i++) {
                    System.out.println(counter);
                    counter++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted Exception");
                    }
                }
            };
            Future<?> result = service.submit(task1);
            System.out.println(result.get(4,TimeUnit.SECONDS));
            System.out.println("reached");
        }
        catch (Exception e){
            System.out.println("Timeout exception");
        }
        finally {
            if(service!=null){
                System.out.println("Finally block before shut down");
                service.shutdown();
            }
        }
    }
}
