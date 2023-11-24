package MultiThread;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CheckResultCall {
    public static void main(String[] args) {
        var service = Executors.newSingleThreadExecutor();
        try{
            Future<Integer> result = service.submit(()->30+11);
            int i = result.get();
            System.out.println(i);
            //System.out.println(result.get());
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        finally {
            service.shutdown();
        }
    }
}
