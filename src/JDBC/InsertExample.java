package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertExample {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/zoo";
        String user = "root";
        String password = "password";
//        String sql2 = """
//                Select id, A.name, A.salary, A.dateOfBirth, B.location, C.manager from Employee A, Branch B, Leads C
//                        where A.employeeNumber = C.EmployeeNumber and
//                              A.location = B.location
//                """;

        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println("no problem");
//        conn.setAutoCommit(false);
//        //System.out.println(sql2);
//
//        var insertSql = "INSERT INTO exhibits VALUES(34,'WILD DEER4',3)";
//        var updateSql = "UPDATE exhibits SET name = 'Wild Deer' " + "WHERE name ='DEER'";
//        var deleteSql = "DELETE FROM exhibits WHERE id =10";
//
//        try (var ps = conn.prepareStatement(insertSql)){
//            int result = ps.executeUpdate();
//            System.out.println(result);
////            if(result!=0){
////                conn.commit();
////            }
//        }
//        conn.rollback();
//
////        try (var ps = conn.prepareStatement(updateSql)){
////            int result = ps.executeUpdate();
////            System.out.println(result);
////        }
//
////        try (var ps = conn.prepareStatement(deleteSql)){
////            int result = ps.executeUpdate();
////            System.out.println(result);
//

    }
}
