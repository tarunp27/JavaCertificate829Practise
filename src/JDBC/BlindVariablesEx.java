package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BlindVariablesEx {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/zoo";
        String user = "root";
        String password = "password";

        Connection conn = DriverManager.getConnection(url, user, password);

        var sql = "SELECT id FROM exhibits WHERE name= ?";

        try(var ps= conn.prepareStatement(sql)){
            ps.setString(1,"Bison");

            try(var rs = ps.executeQuery()){
                while (rs.next()){
                    int id  = rs.getInt("id");
                    System.out.println(id);
                }
            }
        }
    }
}