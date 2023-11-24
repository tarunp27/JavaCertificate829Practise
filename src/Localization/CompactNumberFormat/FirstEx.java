package Localization.CompactNumberFormat;

import java.text.NumberFormat;
import static java.text.NumberFormat.Style;
import java.util.Locale;
import java.util.stream.Stream;

public class FirstEx {
    public static void main(String[] args) {

       Locale.setDefault(Locale.FRANCE);
        var formatters = Stream.of(
                NumberFormat.getCompactNumberInstance(),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.LONG),

                NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.LONG),
                NumberFormat.getNumberInstance());

                formatters.map(s->s.format(779_365_999)).forEach(System.out::println);
    }
}
