package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExecuteExample {
    public static void main(String[] args) throws SQLException {

        String url ="jdbc:mysql://localhost:3306/zoo" ;
        String user = "root";
        String password = "password";

        Connection con = DriverManager.getConnection(url,user,password);

        var insertSql = "INSERT INTO exhibits VALUES(310,'Tiger',3)";
        var deleteSql = "DELETE FROM exhibits WHERE id = 10";
        var selectSql = "SELECT count(*) FROM exhibits ";

        try(var ps = con.prepareStatement(insertSql)){
            boolean result = ps.execute();
            System.out.println(result);
        }

        try(var ps = con.prepareStatement(deleteSql)){
            boolean result = ps.execute();
            System.out.println(result);
        }

        try(var ps = con.prepareStatement(selectSql)){
            boolean result = ps.execute();
            System.out.println(result);
        }
    }
}
