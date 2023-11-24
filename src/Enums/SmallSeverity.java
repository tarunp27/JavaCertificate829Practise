package Enums;

public enum SmallSeverity {
    LOW(30),MEDIUM(15),HIGH(7),URGENT(1);
    private int projectedTurnaroundDays;
    SmallSeverity(int projectedTurnaroundDays) {
        this.projectedTurnaroundDays = projectedTurnaroundDays;
    }
    public int getProjectedTurnaroundDays(){
        return projectedTurnaroundDays;
    }

    public static void main(String[] args) {
        for(SmallSeverity s : SmallSeverity.values()){
            String name = s.name();
            int ord = s.ordinal();
            int days= s.getProjectedTurnaroundDays();
            System.out.println(name+" "+ord+" "+days);
        }
    }
}
