package IO_NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:/Users/tarun/FileSystem/index.txt");
        File f2 = new File("c:/Users/tarun/FileSystem/index.html");

        System.out.println(f1.exists());
        System.out.println(f2.exists());
       // f2.delete();
       // System.out.println(f2.exists());

        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.length());

        Path p1 = Path.of("C:/Users/tarun/FileSystem/index.txt");
        Path p2 = Path.of("c:/Users/tarun/FileSystem/index.html");

        System.out.println(p1.toAbsolutePath());
        System.out.println(p2.getFileName());

        var path = Path.of("C:/Users/tarun/FileSystem/index.txt");
        var path2 = Path.of("C:/Users/tarun/ModuleNew");
        if(Files.exists(path)){
            System.out.println(path.toAbsolutePath());
        }
        try (Stream<Path> stream = Files.list(path2)){
            stream.forEach(p->System.out.println(" "+p.getFileName()));
        }
    }
}
