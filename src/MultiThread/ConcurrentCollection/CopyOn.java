package MultiThread.ConcurrentCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOn {
    public static void main(String[] args) {
        //List<Integer> favNumbers = new ArrayList<>(List.of(4,3,41));
        List<Integer> favNumbers = new CopyOnWriteArrayList<>();
        favNumbers.add(40);
        favNumbers.add(50);
        for(var n : favNumbers){
            System.out.println(n+" ");
            favNumbers.add(n+1);
        }
        System.out.println();
        System.out.println(" " + favNumbers);
    }
}
