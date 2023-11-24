package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        Runnable task1 =() ->
                System.out.println("Printing zoo info");
        Runnable task2 = () ->{
            for(int i = 0; i<10;i++){
                System.out.println("Printing record " + i );
            }
        };
        try{
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(task1);
            service.execute(task2);
            service.execute(task1);
        }
        finally {
            System.out.println(service.isTerminated());
            if(service != null){
                System.out.println("Shutting down.");
//                service.shutdownNow();
                service.shutdown();
                System.out.println("isShutdown() "+service.isShutdown());
                //Thread.sleep(1);
                System.out.println("isTerminated() "+service.isTerminated());
            }
        }
        System.out.println("Completed");
    }}
