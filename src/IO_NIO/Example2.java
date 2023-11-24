package IO_NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) {
        Path p1 = Paths.get("Users/tarun/FileSystem/index.txt");
        Path p2 = Paths.get("/Users/tarun/FileSystem/index.txt");
        Path p3= Paths.get("C:/Users/tarun/FileSystem/index.txt");

        System.out.println(p1.isAbsolute());
        System.out.println(p2.isAbsolute());
        System.out.println(p3.isAbsolute());

        System.out.println(p1.getName(2));

        System.out.println(p1.subpath(0,2));
        System.out.println(p1.subpath(0,3));
        System.out.println(p1.subpath(1,3));

        System.out.println(p1.getRoot());
        System.out.println(p3.getRoot());
    }
}
