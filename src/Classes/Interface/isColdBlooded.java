package Classes.Interface;

public interface isColdBlooded {
    boolean hasScales();
    default double getTemparature(){
        return 10.0;
    }
}

