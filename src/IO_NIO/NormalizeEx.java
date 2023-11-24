package IO_NIO;

import java.io.IOException;
import java.nio.file.Path;

public class NormalizeEx {
    public static void main(String[] args) throws IOException {
        var p1 = Path.of("./amo/../shells.text");
        var p2 = Path.of("/amo/../shells.text");
        var p3 = Path.of("./amo/data/../shells.text");
        var p4 = Path.of("./amo/data/../../shells.text");
        var p5 = Path.of("./amo/data/");
        var p6 = Path.of("../../fish.txt");
        var p7 = Path.of("./shells.text");
        var p8 = Path.of("./amo/../../shells.text");

        System.out.println(p1.normalize());
        //System.out.println(p1);
        System.out.println(p2.normalize());
        System.out.println(p3.normalize());
        System.out.println(p4.normalize());
        System.out.println(p5.normalize());
        System.out.println(p6.normalize());
        System.out.println(p7.normalize());
        System.out.println(p8.normalize());
    //////////////////////////// toRealPath()
        Path p9 = Path.of("C:\\Users\\tarun\\javaProgs\\testlink.java");
        Path p10 = Path.of("C:/Users/tarun/javaProgs/Test2.java");

        System.out.println(p9.toRealPath());
        System.out.println(p10.toRealPath());
    }
}
