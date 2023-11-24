package MultiThread;

//Executer service callable with return values

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class AddData {
    public static void main(String[] args) throws Exception {
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            Future<Integer> future = service.submit(()-> {
                Thread.sleep(4000);
                return 30+40;
                } );
            System.out.println(future.get(5, TimeUnit.SECONDS));
            System.out.println(future.isDone());
        } finally {
            if(service!=null)
                service.shutdown();
            System.out.println(service.isTerminated());
        }
    }
}
