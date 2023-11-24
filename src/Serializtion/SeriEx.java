package Serializtion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SeriEx{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var gorillas = new ArrayList<Gorilla>();
        gorillas.add(new Gorilla("Ishmail",8,true));
        gorillas.add(new Gorilla("Grodd",5,false));

        File dataFile = new File("gorilla.data");

//        saveToFile(gorillas,dataFile);
        var gorillasFromDisk = readFromFile(dataFile);
        System.out.println(gorillasFromDisk);
        System.out.println("Hello");
    }


    static void saveToFile(List<Gorilla> gorillas, File dataFile)throws IOException {
        try(var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))){
            for(Gorilla gorilla : gorillas){
                out.writeObject(gorilla);
            }
        }
    }

   static List<Gorilla> readFromFile(File dataFile) throws IOException,ClassNotFoundException{
        var gorillas = new ArrayList<Gorilla>();
        try(var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))){
            while (true){
                var object = in.readObject();
                if(object instanceof Gorilla g)
                    gorillas.add(g);
            }
        }
        catch(EOFException e){
            System.out.println("end of file reached");
        }
        return gorillas;
    }
}
