package StaticKeyWord;

class Gorilla {
    public static int count;
    public int total;

    public static void addGorilla() { // static method
        count++;                    // you can access static variable
        //total = total + count;    // you cannot access instance variable in static method
    }

    public void babyGorilla() {      // instance method
        count++;                    // you can access static variable
        total = total + count;      // you can access instance variable
    }

    public static void staticAnnounce() {   // static method
        addGorilla();                       // call static method - okay
        //babyGorilla();                    // call instance method - not okay.
    }

    public void announceBabies() {     //  instance method
        addGorilla();                 //  call static method - okay
        babyGorilla();                //  call instance method - okay
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        Gorilla.addGorilla();
        Gorilla.count++;
        Gorilla.staticAnnounce();

        Gorilla gorillaInstance = new Gorilla();

        gorillaInstance.babyGorilla();
        gorillaInstance.total += Gorilla.count;
        gorillaInstance.announceBabies();
    }

    public void callGorilla() {
        Gorilla.addGorilla();
        Gorilla.count++;
        Gorilla.staticAnnounce();

        Gorilla gorillaInstance = new Gorilla();

        gorillaInstance.babyGorilla();
        gorillaInstance.total += Gorilla.count;
        gorillaInstance.announceBabies();
    }

}
