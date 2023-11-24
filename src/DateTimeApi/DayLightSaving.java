package DateTimeApi;

import java.time.*;

// Switch over happends every March 2nd Sunday and November 1st Sunday back.
// In March ie at 1.30 time jumbs from 1.30 to 2.30.
// In November just after 2.30am clock again starts from 1.30am.
public class DayLightSaving {
    public static void main(String[] args) {
        //march changeover
        var date = LocalDate.of(2022, Month.MARCH,13);
        var time = LocalTime.of(1,30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime = ZonedDateTime.of(date,time,zone);
        System.out.println(dateTime);
        System.out.println(dateTime.getOffset());
        System.out.println("----------------------------");
//        dateTime=dateTime.plusHours(1);
//        dateTime=dateTime.plusMinutes(29); // 1:30 to 1:59
        dateTime=dateTime.plusMinutes(30); // 1:30 to 3:00     // that means from 1:59 clock goes to 3:00 instead of 2:00
        System.out.println(dateTime);
        System.out.println(dateTime.getOffset());
        System.out.println("----------------------------");
/*
        2022-03-13T01:30-05:00[US/Eastern]
                -05:00
                ----------------------------
        2022-03-13T03:00-04:00[US/Eastern]
                -04:00
                ----------------------------
*/

    }
}
