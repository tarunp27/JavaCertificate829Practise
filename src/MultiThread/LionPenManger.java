package MultiThread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;

public class LionPenManger {
    public void removeLion(){
        System.out.println("Removing Lions");
    }
    public void cleanPen(){
        System.out.println("Cleaning Pen");
    }
    public void addLion(){
        System.out.println("Adding Lions");
    }
//    public void performTask(){
//        removeLion();
//        cleanPen();
//        addLion();
//    }
    public void performTask(CyclicBarrier c1,CyclicBarrier c2) throws BrokenBarrierException, InterruptedException {
        try {
            removeLion();
            c1.await();
            cleanPen();
            c2.await();
            addLion();
        }
        catch (InterruptedException|BrokenBarrierException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(6);
        try{
            var manager = new LionPenManger();
            var c1 = new CyclicBarrier(4,()-> System.out.println("Removing done!**"));
            var c2 = new CyclicBarrier(4,()-> System.out.println("***!Cleaned"));
            //for(int i = 0; i <5; i++)               //will give error
            for(int i = 0; i <4; i++)
                service.submit(()-> {
                    try {
                        manager.performTask(c1,c2);
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
        }
        finally {
            service.shutdown();
        }
    }
}
