package Classes.ProtectedChk1;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Optional;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProtectedClass1 {
    static int counter = 0;
    public static void main(String[] args) throws Exception {
        ExecutorService service = null;
        service = Executors.newSingleThreadExecutor();
        Future<?> result = service.submit(()-> {
                    for (int j =0; j< 5; j++ )
                    {
                        counter++;
                    }
                });
        System.out.println(result.get());
        int[][] a = {{ 00, 01 }, { 10, 11 } };
        int i = 99;
        try {
            int ii = a[val()] [i=1]++;
            System.out.println(ii);
            System.out.println(a[1][0]);
            System.out.println(a[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Lock lock = new ReentrantLock();
        if (lock.tryLock()) {
            lock.lock();                    // this will not give error on the second lock
            System.out.println("Locked!");
            lock.unlock();                 //locked twice and unlocked once. when it is called again the tryLock failed and never entered the path.
        }

        if (lock.tryLock()) {
            System.out.println("Lock successfully");
        } else {
            System.out.println("Lock failed");
        }


    }

    private static int val() {
        return 0;
    }
}




