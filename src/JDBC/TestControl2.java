package JDBC;

import javax.swing.*;
import java.sql.*;

public class TestControl2 {
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/zoo" ;
        String user = "root";
        String password = "password";

        try(Connection con = DriverManager.getConnection(url,user,password)){

//            run(con,"INSERT INTO names VALUES(22,5,'Tarun')");
//            run(con,"INSERT INTO names VALUES(23,6,'Neha')");
//            run(con,"INSERT INTO names VALUES(24,5,'Sarvesh')");
//            run(con,"INSERT INTO names VALUES(25,6,'Pugal')");
//            run(con,"INSERT INTO names VALUES(26,6,'Mala')");

            printCount(con,"SELECT  count(*), max(id) FROM names");
        }
    }
    private static void run (Connection con,String sql) throws  SQLException{
        try(PreparedStatement ps = con.prepareStatement(sql)){
            ps.executeUpdate();
        }
    }
    private static void printCount(Connection con, String sql) throws SQLException{
        try (PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs= ps.executeQuery();
            rs.next();
            System.out.println(rs.getInt("count(*)"));
            System.out.println(rs.getString(2));
        }
    }
}
