package ScheduleThread;

import java.util.concurrent.*;

public class ScheduleThreadEx1 {
    public static void main(String[] args) {

        ScheduledExecutorService service = null;
        try{
           service = Executors.newSingleThreadScheduledExecutor();
           Runnable task1 = ()-> System.out.println("Hello zoo");
            Callable<String> task2 = ()-> {System.out.println("task2"); return  "Monkey";};
            ScheduledFuture<?> r1 = service.schedule(task1 , 10 , TimeUnit.SECONDS);
            ScheduledFuture<?> r2 = service.schedule(task2 , 20, TimeUnit.SECONDS);
        }
        finally {
            if(service!=null)
                service.shutdown();
        }
    }
}
