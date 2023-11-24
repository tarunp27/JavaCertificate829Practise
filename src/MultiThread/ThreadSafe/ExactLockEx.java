package MultiThread.ThreadSafe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExactLockEx {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        //if(lock.tryLock()){
        if(lock.tryLock()){
            try{
                lock.lock();
                System.out.println("Lock Obtained,entering protected code");
            }
            finally {
                lock.unlock();
            }
        }
        else {
            System.out.println("Unable to acquire lock,doing something else");
        }
        new Thread(()-> System.out.println(lock.tryLock())).start();
    }
}
