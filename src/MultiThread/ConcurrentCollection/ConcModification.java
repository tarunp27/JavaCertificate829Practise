package MultiThread.ConcurrentCollection;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ConcModification {
    public static void main(String[] args) {
        var foodData = new ConcurrentHashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        foodData.put("duck",3);
        System.out.println(foodData);

        for (String key : foodData.keySet()) {
            foodData.remove(key);
            System.out.println("key removed " + key);
        }
        List<String> list1 = List.of("Tarun");
        list1.add(" Puglendi");
        System.out.println(list1);
    }
}
