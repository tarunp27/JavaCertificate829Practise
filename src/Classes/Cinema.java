package Classes;

public class Cinema {
    private int Seats;
    private char Rows;
    public Cinema (int Seats,char Rows){
        //super();
        this.Seats=Seats;
        this.Rows=Rows;
    }
    public Cinema (int Seats){
        //super();
        this.Seats=Seats;
        //this.Rows=null;
    }
}
class Pvr extends Cinema{
    public Pvr(int Seats, char Rows) {
        super(8, 'J');
    }
    public Pvr(int Seats) {
        super(4);
    }
}
