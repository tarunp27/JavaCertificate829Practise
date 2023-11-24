package Collection.Notes;

import java.util.HashMap;
import java.util.Map;

public class AnimalNames {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("koala","bamboo");
        map.put("lion","meat");
        map.put("giraffe","leaf");

        String food =map.get("lion");
        System.out.println(food);

        for(String key : map.keySet()){
            System.out.print(key+",");
        }
        //--------------------------------------------------------------------------------
        //System.out.println(map.contains("lion"));//ce collection interface not map interface
        System.out.println(map.containsKey("lion"));
        System.out.println(map.containsValue("lion"));
        System.out.println(map.size());
        map.clear();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}

