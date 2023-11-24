package MultiThread.ThreadSafe;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

//Synchronize block

public class SheepManager2 {
    private int SheepCount = 0;

    private void incremeantandReport() {
        synchronized(this){
            System.out.print(++SheepCount + " ") ;
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManager2 managers = new SheepManager2();
            for (int i = 0; i < 10; i++)
                service.submit(() -> managers.incremeantandReport());
        } finally {
            service.shutdown();
        }
    }
}
