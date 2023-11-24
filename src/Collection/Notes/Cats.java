package Collection.Notes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Cats {
    public static void main(String[] args) {
        //Collection<String> cats = new ArrayList<>();
        Collection<String> caty = Arrays.asList("Annie","Ripley");
        caty.forEach(System.out::println);
        caty.forEach(c-> System.out.println(c));

    }
}
