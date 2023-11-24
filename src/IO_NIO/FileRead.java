package IO_NIO;

import java.io.*;

public class FileRead  {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Path p1 = Path.of("C:/Users/tarun/FileSystem/index1.html");
//
//        try(var br = new BufferedReader(new FileReader("C:/Users/tarun/FileSystem/index1.html"))) {
//            System.out.println(br.readLine());
//        }
//        File fl = new File("index1.html");
//        try(var ois = new ObjectInputStream(
//                new BufferedInputStream(
//                        new FileInputStream("index1.html"))))
//        {
//            System.out.print(ois.readObject());
//        }

//        try (var ois = new ObjectInputStream(
//                new BufferedInputStream(
//                        new FileInputStream("index.txt")))) {
//                                System.out.print(ois.readObject());
//}

        File fl = new File("index.txt");

         try(var fis = new FileInputStream(fl);
             var bis = new BufferedInputStream(fis);
             var ois = new ObjectInputStream(bis);)
         {
             System.out.println(ois.readObject());
         }

    }
}
