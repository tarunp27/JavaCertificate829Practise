package IO_NIO;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class SearchEx {
    public static void main(String[] args) throws IOException {
//        Path p1 = Paths.get("C:\\Users\\tarun\\Practice\\");
//        long minsize = 100;
//        try(var s = Files.find(p1,3,
//                (p,a)->a.isRegularFile()
//        && p.toString().endsWith(".java")
//        && a.size() > minsize)){
//            s.forEach(System.out::println);
//        }
        Path p2 = Paths.get("C:\\Users\\tarun\\Practice\\");
//        long result = new SearchEx().getPathSize(p2);
//        System.out.println("result " + result);

        walkresult(p2);
    }
   // -----------------------------------------------------------------------------

    public long getPathSize(Path source) throws IOException{
        try(var s = Files.walk(source,6)){
            return s.parallel().
                    filter(p->!Files.isDirectory(p))
                            .mapToLong(this::getSize)
                            .sum();
        }
    }
    private long getSize(Path p){
        try{
            return Files.size(p);
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }


    public static void walkresult(Path source) throws IOException{
        try(var s = Files.walk(source,3)){
            s.parallel()
                    .filter(p->!Files.isDirectory(p))
                    .forEach(p-> System.out.println(p.toAbsolutePath()));
        }
    }
}
