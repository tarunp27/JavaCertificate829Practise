package Exception;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class NumberFormatEx {
    public static void main(String[] args) {
        Double d = 1221135.88;
        NumberFormat f1 = new DecimalFormat("Your Balance $#,###,###.##");
        System.out.println(f1.format(d));

        LocalDate date = LocalDate.of(2022, Month.OCTOBER,20);
        LocalTime time = LocalTime.of(8,10,55);
        LocalDateTime dateTime = LocalDateTime.of(date,time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        //escape key sequence
        var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
        System.out.println(dateTime.format(g1));  // October 20, Party's at 06:15

        var x = DateTimeFormatter.ofPattern("'Pugal''s time is' hh:mm");
        System.out.println(dateTime.format(x));
    }
}
