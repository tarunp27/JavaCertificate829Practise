package DateTimeApi;

import java.time.*;

public class DurationEx2 {
    public static void main(String[] args) {
        var date = LocalDate.of(2022,1,20);
        var time = LocalTime.of(6,15);

        var dateTime = LocalDateTime.of(date,time);
        var duration = Duration.ofHours(23);
        //var period = Period.ofDays(1);
        System.out.println(dateTime.plus(duration));
        //System.out.println(dateTime.plus(period));
        System.out.println(time.plus(duration));
        //System.out.println(date.plus(duration));   //UnsupportedTemporalTypeException
    }
}
