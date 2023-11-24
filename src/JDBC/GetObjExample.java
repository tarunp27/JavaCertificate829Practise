package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetObjExample {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/zoo";
        String user = "root";
        String password = "password";

        Connection conn = DriverManager.getConnection(url,user,password);

        var sql = "SELECT id,name FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
        var rs = ps.executeQuery()){

            while (rs.next()){
                Object idField = rs.getObject("id");
                Object nameField = rs.getObject("name");

                if(idField instanceof  Integer id)
                    System.out.println("Id: " + id);

                if(nameField instanceof String name)
                    System.out.println("Name: "+name);
            }
        }
    }
}
