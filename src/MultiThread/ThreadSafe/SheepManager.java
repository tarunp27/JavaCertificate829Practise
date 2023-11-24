package MultiThread.ThreadSafe;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
   //private int SheepCount=0;    //volatile is not threaad safe
   private AtomicInteger SheepCount = new AtomicInteger(0);
   private void incremeantandReport() {
       System.out.print(SheepCount.incrementAndGet()+ " ");
//       synchronized (this) {
//           System.out.print(++SheepCount + " ");
       }
  // }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(8);
        try{
            SheepManager manager = new SheepManager();
            for( int i = 0;i<20;i++)
                service.submit(()-> manager.incremeantandReport());
        }
        finally {
            service.shutdown();
        }
    }
}
