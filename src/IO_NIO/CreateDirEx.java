package IO_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateDirEx {
    public static void main(String[] args) throws IOException {
        Path p1 = Path.of("C:/Users/tarun/FileSystem/Project1/src/javaProgs");
        Path p2 = Path.of("C:/Users/tarun/FileSystem/Project2/src/javaProgs");
        Path p3 = Path.of("C:/Users/tarun/FileSystem/Project3/src/javaProgs");
        Path p4 = Path.of("C:/Users/tarun/FileSystem/index.html");
        Path p5 = Path.of("C:/Users/tarun/FileSystem/index1.html");

        //Files.createDirectory(p1);
        //Files.createDirectory(p2);
        Files.createDirectories(p3);

        // file matching and mismatching
        System.out.println(Files.mismatch(p4,p5));
        System.out.println(Files.isSameFile(p4,p5));

    }
}
