package MultiThread;

import java.util.concurrent.*;

public class SelfEx {
    private static int counter =0;
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try{
            Future<?> result =service.submit(()->{
                for(int i =0;i<6;i++) {
                    System.out.print(counter+" ");
                    counter++;
                    try {
                        Thread.sleep(1200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            result.get(6, TimeUnit.SECONDS);
            System.out.println("Reached!");
        }
        catch (TimeoutException e){
            System.out.println("Not reached time");;
        }
        finally {
            service.shutdown();
            //Thread.sleep(1000);
            System.out.println(service.isTerminated());
        }
    }
}
