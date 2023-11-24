import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneIdEx {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone.getDisplayName(TextStyle.FULL, Locale.ROOT));

        ZoneId zone1 =  ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");

        LocalTime id1 = LocalTime.now(zone1);
        LocalTime id2 = LocalTime.now(zone2);

        System.out.println(id1);
        System.out.println(id2);

        System.out.println(id1.isAfter(id2));
        System.out.println(id1.isBefore(id2));
    }
}
