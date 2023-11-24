package Methods;

import java.util.ArrayList;
import java.util.List;

public class PassByReference {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        name.append("tarun");
        System.out.println(name);
        speak(name);
        System.out.println(name);

        List<String> names = new ArrayList<>();
        names.add("tarun ");
        System.out.println(names);
        speak2(names);
        System.out.println(names);
    }
    public static void speak(StringBuilder s){
        s.append("pugal");
    }

    public static void speak2(List al){
        al.add("Pugal");
    }

}
