package Classes.Interface;

//all are three different methods
interface walk{
    default Number getSpeed(){
        return 5;
    }
}
interface run{
    default Integer getSpeed(){
        return 15;
    }
}
public class DefaultInteraceEx implements walk,run{
    public Integer getSpeed(){
        return 10;
    }
    public int getRunSpeed(){
        return run.super.getSpeed();
    }

    public static void main(String[] args) {
        System.out.println(new DefaultInteraceEx().getRunSpeed());
    }
}
