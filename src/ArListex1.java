import java.util.ArrayList;
public class ArListex1 {
    public static void main(String[] args) {

        var list = new ArrayList<>();
        list.add("Pugal");
        for(Object s: list){}  //String will give error instead of Object

    }
}
