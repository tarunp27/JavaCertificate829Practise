package IO_NIO;

import java.nio.file.Path;

public class RelativiseEx {
    public static void main(String[] args) {
        Path p1 = Path.of("/Users/tarun/FileSystem/index.html");
        Path p2 = Path.of("/Users/tarun/FileSystems/index.html");
        Path p3 = Path.of("/index.html");
        Path p4 = Path.of("Users/tarun/FileSystem/index.html");
        Path p5 = Path.of("C:/Users/tarun/FileSystem/index.html");
        Path p6 = Path.of("D:/Users/tarun/FileSystem/index.html");

        System.out.println(p1.relativize(p2));
        System.out.println(p2.relativize(p3));
        //System.out.println(p3.relativize(p4));
        //System.out.println(p2.relativize(p5));
        //System.out.println(p5.relativize(p6));

        for(long y = 0 ; y<10;y++);
    }
}
