package DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ManupulationEx1 {
    public static void main(String[] args) {
        var date = LocalDate.now();
        System.out.println(date);

        var time = LocalTime.now();
        System.out.println(time);

        var dateTime = LocalDateTime.of(date,time).minusDays(2).minusHours(10).minusSeconds(90);
        System.out.println(dateTime);
    }
}
