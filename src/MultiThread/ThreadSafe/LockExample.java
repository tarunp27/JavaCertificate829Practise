package MultiThread.ThreadSafe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void printHello(Lock lock) throws InterruptedException {
        System.out.println("Inside printHello()");
        try{
            lock.lock();
            System.out.println("after timer lock");
            System.out.println("Hello");
            Thread.sleep(5000);
        }
        finally {
            System.out.println("before unlock");
            lock.unlock();
           // lock.unlock();
            System.out.println("after unlock");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Thread(() -> {
            try {
                printHello(lock);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
      Thread.sleep(4000);
        if(lock.tryLock(2,TimeUnit.SECONDS)){
            try{
                System.out.println("Lock obtained entering protected code");
            }
            finally {
                lock.unlock();
            }
        }
        else {
            System.out.println("Unable to aquire lock");
        }
    }
}
