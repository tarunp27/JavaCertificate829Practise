package MultiThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Bank {
    private Lock vault = new ReentrantLock();
    private int total = 0;
    public void deposit(int value) {
        try {
            vault.tryLock() ;
                total += value;
        }
        finally {
            vault.unlock();
        }
    }

    public static void main(String[] args){
        var bank = new Bank();
        IntStream.range(1,50).parallel().forEach(s->
                bank.deposit(s));
        System.out.println(bank.total);
    }
}
