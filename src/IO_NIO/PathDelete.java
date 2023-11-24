package IO_NIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDelete {
    public static void main(String[] args) throws IOException {
//        Path p = Paths.get("C:\\Users\\tarun");
//        boolean b = Files.deleteIfExists(p);
//        System.out.println(b);

        Path p1 = Paths.get("C:\\Users\\tarun\\JavaProgs");
        try {
            DirectoryStream<Path> ds = Files.newDirectoryStream(p1, "*.{gif,java,class}");

            for (Path pa : ds) {
                System.out.println(pa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}