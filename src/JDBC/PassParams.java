package JDBC;

import java.io.PipedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PassParams {
    public static void main(String[] args) throws SQLException {

        String url ="jdbc:mysql://localhost:3306/zoo" ;
        String user = "root";
        String password = "password";

        Connection conn = DriverManager.getConnection(url,user,password);

        register(conn,105,2,"$pugal");
        register(conn,115,3,"$tarun");
    }
    public static void register(Connection con,int key,int type,String name) throws SQLException{
        String sql = "INSERT INTO names VALUES(?,?,?)";

        try (PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1,key);
            ps.setString(3,name);
            ps.setInt(2,type);
            ps.executeUpdate();   // insert

            ps.setInt(1,key+1);
            ps.executeUpdate();   // insert

            ps.setInt(1,key+2);
            ps.executeUpdate();   // insert
        }
    }
}
