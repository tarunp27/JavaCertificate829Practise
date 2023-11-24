package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PassVales {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/zoo";
        String user ="root";
        String password ="password";

        Connection conn = DriverManager.getConnection(url,user,password);

        String sql = "INSERT INTO names VALUES(?,?,?)";

        try(PreparedStatement ps =conn.prepareStatement(sql)){
            ps.setString(3,"Curio");
            ps.setInt(1,45);
            ps.setInt(2,299);
            ps.executeUpdate();

            ps.setInt(1,44);
            ps.executeUpdate();
        }
        catch(SQLException se){
            se.printStackTrace();
        }
    }
}
