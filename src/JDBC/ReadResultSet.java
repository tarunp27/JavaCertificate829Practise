package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class ReadResultSet {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/zoo";
        String user = "root";
        String password = "password";
        String sql = "SELECT id, name FROM exhibits";

        Connection conn = DriverManager.getConnection(url,user,password);

        var idToNameMap = new HashMap<Integer,String>();

        try(var ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery()){
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                idToNameMap.put(id,name);
            }
            System.out.print(idToNameMap);
        }
    }
}
