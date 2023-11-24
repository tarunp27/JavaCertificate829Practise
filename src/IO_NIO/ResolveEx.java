package IO_NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveEx {
    public static void main(String[] args) {
        Path p0 = Path.of("C:/Users/sarvesh");
        Path p1 = Path.of("C:/Users/tarun/");        //->Absolute
        Path p2 = Path.of("FileSystem/index.html");  //->Relative
        Path p3 = Path.of("/tarun/FileSystem/index.txt");//->Relative
        Path p4 = Path.of("tarun/FileSystem/index.txt");//->Relative

        //System.out.println(p4.isAbsolute());
        System.out.println(p0.resolve(p1));
        System.out.println(p1.resolve(p2));    //perfect concatination
        System.out.println(p2.resolve(p1));    //absolute path
        System.out.println(p1.resolve(p3));
        System.out.println(p2.resolve(p4));
        System.out.println(p2.resolve(p2));

        /*
        Path p = Path.of("whale");
        p.resolve("krill");
        p.resolve("Shark");
        System.out.println(p);

        Path path = Paths.get("/load/hippo/harry.happy");

        System.out.println("Path name is"+path);
        for(int i = 0;i< path.getNameCount();i++){
            System.out.println(path.getName(i));
        }
        var w = Paths.get("/mammal/omnivore/racoon.image");
        System.out.println(w.getName(0));
        System.out.println(w.getParent());
        System.out.println(w.getFileSystem());
        System.out.println(w.getFileName());
        System.out.println(w.getRoot());
         */

    }
}
