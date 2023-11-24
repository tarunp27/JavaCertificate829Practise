package MultiThread.ThreadSafe;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

//Synchronize block

public class SheepManager3 {
    private static int SheepCount = 0;

    private static void incremeantandReport() {
        synchronized (SheepManager.class) {
            System.out.print(++SheepCount + " ");
        }
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManager3 managers = new SheepManager3();
            for (int i = 0; i < 20; i++)
                service.submit(() -> managers.incremeantandReport());
        } finally {
            service.shutdown();
        }
    }
}
