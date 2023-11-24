package Records;


record EmployeeRecord(String name,int employeeNumber){
    private enum EBear {
        RC,FO,KO;
    }


};

public class RecordEx1 {
    private enum EBear {
        RC,FO,KO;
    }


    public static void main(String[] args) {
        java.util.Date date ;
        java.sql.Date sqlDate;
        EmployeeRecord employeeRecord = new EmployeeRecord("Tarun",2345);
        EmployeeRecord employeeRecord2 = new EmployeeRecord("Tarun",2345);
        EmployeeRecord employeeRecord3 = new EmployeeRecord("Varun",0);

        System.out.println(employeeRecord);
        System.out.println(employeeRecord2);
        System.out.println(employeeRecord3);

        System.out.println(employeeRecord.equals(employeeRecord2));

        System.out.println(employeeRecord.hashCode());
        System.out.println(employeeRecord2.hashCode());

        System.out.println(employeeRecord.name());
    }
}
