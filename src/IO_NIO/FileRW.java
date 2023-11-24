//package IO_NIO;
//
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.stream.Stream;
//
//public class FileRW {
//    public static void main(String[] args) throws IOException {
//        try(
//                FileInputStream fis = new FileInputStream("index2.html");
//                FileOutputStream fos = new FileOutputStream("Hello.html")
//            )
//        {
//            copyStream(fis,fos);
//        }
//
////        File f1 = new File("index1.html");
////        File f2 = new File("welcome.html");
////        copyText(f1,f2);
//
////        Path p1 = Path.of("index1.html");
////        Path p2 = Path.of("Task.html");
////        copyPathAsBites(p1,p2);
//
////        Path p1 = Path.of("index1.html");
////        readLazy(p1);
//
//    }
//    public static void copyStream(InputStream in, OutputStream out) throws IOException{
//        int batchsize =100;
//        var buffer = new byte[batchsize];
//
//        int lengthRead;
//        while((lengthRead = in.read(buffer))>0){
//            out.write(buffer,0,lengthRead);
////            out.flush();
//            System.out.println(lengthRead);
//        }
//    }
//    public static void copyText(File src,File dest) throws IOException{
//        try(var reader = new BufferedReader(new FileReader(src));
//            var writer = new BufferedWriter(new FileWriter(dest))) {
//            String line = null;
//        while((line = reader.readLine()) != null){
//                writer.write(line);
//                writer.newLine();
////            }
////        }
////    }
//
////    public static void copyPathAsBites(Path input, Path output){
////        byte[] bytes = Files.readAllBytes(input);
////        Files.write(output,bytes);
////    }
////
////    public static void readLazy(Path path){
////        try(Stream<String> s = Files.lines(path)){
////            //s.forEach(System.out::println);
////            s.filter(f->f.contains("html")).forEach(System.out::println);
////        }
////    }
////}
