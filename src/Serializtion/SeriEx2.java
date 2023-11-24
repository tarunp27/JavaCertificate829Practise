package Serializtion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class SeriEx2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var chimpanzees = new ArrayList<Chimpanzee>();
        chimpanzees.add(new Chimpanzee("Ham",2,'B'));
//        System.out.println("1 ===>"+chimpanzees);
        chimpanzees.add(new Chimpanzee("Enos",4,'X'));
//        System.out.println("2 ===>"+chimpanzees);

        File dataFile = new File("chimpanzee.data");

//        System.out.println(Chimpanzee.height);
        saveToFile(chimpanzees,dataFile);
//        System.out.println(Chimpanzee.height);

        var chimpanzeefromDisk= readFromFile(dataFile);
        System.out.println(chimpanzeefromDisk);

    }
    static void saveToFile(List<Chimpanzee> chimpanzees, File dataFile)throws IOException {
        //System.out.println(chimpanzees);
        try(var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))){
            for(Chimpanzee ch : chimpanzees){
                out.writeObject(ch);
            }
        }
    }

    static List<Chimpanzee> readFromFile(File dataFile) throws IOException,ClassNotFoundException{
        var chimpanzees = new ArrayList<Chimpanzee>();
        try(var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))){
            while (true){
                var object = in.readObject();
                if(object instanceof Chimpanzee g)
                    chimpanzees.add(g);
            }
        }
        catch(EOFException e){
            System.err.println("end of file reached");
        }
        return chimpanzees;
    }
}
