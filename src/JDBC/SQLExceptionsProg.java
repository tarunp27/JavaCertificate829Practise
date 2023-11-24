package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionsProg {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/zoo";
        String user = "root";
        String password = "password";

        Connection conn = DriverManager.getConnection(url,user,password);

        var sql = "SELECT not_a_column FROM names";

        try(var ps = conn.prepareStatement(sql);
            var rs = ps.executeQuery()){

            while (rs.next()){
                System.out.println(rs.getString(1));
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
    }
}
