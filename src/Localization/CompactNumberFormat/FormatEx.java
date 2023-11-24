package Localization.CompactNumberFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import static java.time.format.FormatStyle.SHORT;

public class FormatEx {
    public static void main(String[] args) {
        var dt = LocalDate.of(2022,06,8);
        var india = new Locale("en","US");

        System.out.println(DateTimeFormatter.ofLocalizedDate(SHORT).format(dt));     //   08/06/22
        System.out.println(DateTimeFormatter.ofLocalizedDate(SHORT).withLocale(india).format(dt));  //    6/8/22
    }
}
