package DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodEx4 {
    public static void main(String[] args) {
        var date = LocalDate.of(2022,1,20);
        var time = LocalTime.of(6,15);

        var dateTime = LocalDateTime.of(date,time);
        var period = Period.ofMonths(1);

        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
        //System.out.println(time.plus(period));     //UnsupportedTemporalTypeException
    }
}
