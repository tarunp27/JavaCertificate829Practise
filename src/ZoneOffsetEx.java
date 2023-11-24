import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;

public class ZoneOffsetEx {
    public static void main(String[] args) {
        ZoneOffset zone = ZoneOffset.UTC;

        Temporal temp = zone.adjustInto(ZonedDateTime.now());
        System.out.println(temp);

        ZoneOffset zone2 = ZoneOffset.ofHours(5);
        System.out.println(zone2);
    }
}
