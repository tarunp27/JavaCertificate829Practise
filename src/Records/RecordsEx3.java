package Records;

import java.util.Locale;

public class RecordsEx3 {
}
sealed interface Bird{}
record Crane (int numberEggs,String name) implements Bird{
//    public Crane(int numberEggs, String name) {
//        this.numberEggs = numberEggs;
//        this.name = name;
//    }
    public Crane {
        if (numberEggs < 0) throw new IllegalArgumentException();
        name = name.toUpperCase();
    }
}