package MultiThread;

import com.sun.source.tree.LiteralTree;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//submit callable resuts stored in invoke all method results stored in multiple results

public class InvokeAllExmp1 {
    public static void main(String[] args) throws Exception {
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            System.out.println("Begin");
            Callable<String> task = () -> "result";
            List<Future<String>> list = service.invokeAll(
                    List.of(task,task,task));
            for(Future<String> future : list){
                System.out.println(future.get());
            }
        }
        finally {
            if (service!= null)
                service.shutdown();
        }
    }
}
