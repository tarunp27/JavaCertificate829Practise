package Records;

record EmployeeRecords(String name,int employeeNumber){
//int age =90;
//    public EmployeeRecords(String name,int employeeNumber){      //canonical constructors
//        if (employeeNumber <=0){
//            System.out.println("Employee Number Error");
//        }
//        this.employeeNumber=employeeNumber;
//        this.name = name;
//    }
    public EmployeeRecords{                     //compact constructors
        if(employeeNumber<=0){
            throw new IllegalArgumentException("Please enter an EmployeeNumber above 0");
            //System.out.println("Employee id above 1");
        }
    }

    public String name() {
        return "Hello "+name;
    }


};

public class RecordEx2 {
    public static void main(String[] args) {
        int age = 100;
        EmployeeRecords employeeRecord = new EmployeeRecords("Tarun",-1);
        System.out.println(employeeRecord);
        //System.out.println(employeeRecord2);

        EmployeeRecords er2 = new EmployeeRecords("Arun",100);

        System.out.println(er2.employeeNumber()+"  "+er2.name());



    }
}
