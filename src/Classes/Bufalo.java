package Classes;

public class Bufalo {
    public long getWeight(){
        return getWeight()+900;
    }
    public static void main(String[] args) {
        new Bufalo().getWeight();
    }
}
