package Inheritance;


class Camel {
    public int getNumberofHumps() {
        return 1;
    }
    public void printCamel() {
        System.out.println("Camel");
    }
}

class BactirailCamel extends Camel {
    public int getNumberofHumps() {
        return 2;
    }
    public void printBactiralCamel() {
        System.out.println("BactrialCamel");
    }
}

public class Rider {
    public static void main(String[] args) {
        Camel c = new BactirailCamel();
        System.out.println(c.getNumberofHumps());
        c.printCamel();
    }
}

