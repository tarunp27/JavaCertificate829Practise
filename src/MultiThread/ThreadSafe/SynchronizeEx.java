package MultiThread.ThreadSafe;

import javax.print.attribute.standard.RequestingUserName;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizeEx {
    private static AtomicInteger sheepCount = new AtomicInteger(0);
    static void IncrementandReport() {                                 //synchronized method
        synchronized (SynchronizeEx.class) {
            System.out.print(sheepCount.incrementAndGet() + " ");
        }
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(8);
        try{
            SynchronizeEx sync = new SynchronizeEx();
            for(int i=0;i<20;i++){
                service.submit(()->sync.IncrementandReport());
            }
        }
        catch (Exception e){
            e.getStackTrace();
        }
        finally {
            service.shutdown();
        }
    }
}

//}