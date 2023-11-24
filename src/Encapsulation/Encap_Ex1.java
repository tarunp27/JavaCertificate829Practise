package Encapsulation;

class Eagle{
    private int numEggs =1;
    //public int numEggs2 = 5;
    public int GetnumEggs(){
        return this.numEggs;
    }
    public void SetnumEggs(int i){
        numEggs = i;
    }
}
public class Encap_Ex1 {
    public static void main(String[] args) {
        Eagle e1 = new Eagle();
        e1.SetnumEggs(5);
        System.out.println(e1.GetnumEggs());
    }
}
