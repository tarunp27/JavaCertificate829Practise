package DateTimeApi;

import java.time.*;

public class InstantEx2 {
    public static void main(String[] args) {
        var date = LocalDate.of(2022,5,25);
        var time = LocalTime.of(11,55,00);
        var zone = ZoneId.of("US/Eastern");
        var zoneDateTime = ZonedDateTime.of(date,time,zone);
        var instant = zoneDateTime.toInstant();

//        var dateTime = LocalDateTime.of(date,time);
//        var instantDT = dateTime.toInstant();    //LocalDateTime cannot be converted to instant

        System.out.println(zoneDateTime);
        System.out.println(instant);
    }
}
