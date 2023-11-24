package TextBlock;

public class Example1 {
    public static void main(String[] args) {
        String textblock = """
                <session>\
                    <speaker>
                        Jeannae\s                     Hello
                    </speaker>
                    <title>
                        becoming java certified developer JAVA 17   \
                    </title>
                </session>""";
        System.out.println(textblock);
        String textblck = """
                better \"""
                but can do \"\"\"
                """;
        System.out.println(textblck);
    }
}
