package Enums;

enum Bikes {
     FZ(150),PULSAR(200),CBR,DUKE;
     int cc;

     Bikes(int cc){this.cc = cc;}
     Bikes(){this.cc=250;}

    public int getCc(){return cc;}
}

public class Bike {
    public static void main(String[] args) {

        Bikes []b = Bikes.values();

        for(Bikes bike : b)
        {
            System.out.println("The bike: "+ bike + " and the volume is:" +bike.cc+"cc");
        }

        System.out.println(Bikes.CBR.ordinal());
        System.out.println(Bikes.FZ.name());
    }
}
