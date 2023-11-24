package MultiThread;

import java.util.List;

public class ParallelStream {
    public static int doWork(int input){
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return input;
    }

    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
//        List.of(1,2,3,4,5)                                   //normal stream doesnt run parallel
//                .stream()
//                .map(w->doWork(w))
//                .forEach(s -> System.out.print(s + " "));

//        List.of(1,2,3,4,5)                                  //THE UTPUT IS NOT ON ORDERED FORm we have to use foreachOrdered
//                .parallelStream()
//                .map(w->doWork(w))
//                .forEach(s -> System.out.print(s + " "));

        List.of(5,4,3,2,1)
                .parallelStream()
                .map(w->doWork(w))
                .forEachOrdered(s -> System.out.print(s + " "));
        System.out.println();
        var timeTaken = (System.currentTimeMillis()-start)/1000;
        System.out.println("Time taken:" + timeTaken + "seconds");


    }
}

