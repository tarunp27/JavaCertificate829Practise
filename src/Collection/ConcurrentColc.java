package Collection;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentColc {
    public static void main(String[] args) {
        List<String> birds = new CopyOnWriteArrayList<>();
//        List<String> birds = new ArrayList<>();
        birds.add("hawx");
        birds.add("eagle");
        birds.add("sparrow");

        for(String b1 : birds){
            System.out.println(b1);
        }
//        for(String b :birds){
//            birds.remove(b);
//        }
        System.out.println(birds);
        System.out.println("Loop started to add");
        var copy2 = new CopyOnWriteArrayList<String>(birds);
        for(String q : copy2)
            copy2.add("2");
        System.out.println(copy2);

        Lock lock = new ReentrantLock();

    }


    public static void copy(String records1, String records2)   {
        try {
            InputStream is = new FileInputStream(records1);
            OutputStream os = new FileOutputStream(records2);
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        } catch (IOException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }


}
