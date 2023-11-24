import Classes.Immutable1.Test;

import java.util.Locale;

public class EnumString {
    public enum TestStyle{
        BOLD,ITALIC,UNDERLINE,STRIKETHROUGH
    }

    public static void main(String[] args) {
        String style = "Bold";
        TestStyle ts = TestStyle.valueOf(style.toUpperCase());
        TestStyle.STRIKETHROUGH.toString();
    }
}
