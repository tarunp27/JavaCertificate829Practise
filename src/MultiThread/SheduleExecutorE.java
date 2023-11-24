package MultiThread;

import java.util.concurrent.*;

public class SheduleExecutorE {
    public static int count;
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        try{
            Runnable task1 = ()->{for(int i = 0 ;i<50;i++)count++;};
            Callable<String> task2 = ()->"Monkey";
            ScheduledFuture<?> r1 = service.schedule(task1,10,TimeUnit.SECONDS);
            ScheduledFuture<?> r2 = service.schedule(task2,8,TimeUnit.SECONDS);
            System.out.println(r1.get());
            System.out.println(r2.get());

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if(service!=null){
                service.shutdown();
            }
        }
    }
}
