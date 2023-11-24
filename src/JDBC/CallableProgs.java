package JDBC;

//using stored procedure read_e_names()

import java.sql.*;

public class CallableProgs {
    public static void main(String[] args) throws SQLException {

        String url ="jdbc:mysql://localhost:3306/zoo" ;
        String user = "root";
        String password = "password";

        Connection con = DriverManager.getConnection(url,user,password);

        String sql = "{call read_e_names()}";

        try(CallableStatement cs = con.prepareCall(sql);
            ResultSet rs = cs.executeQuery()){

            while (rs.next()){
                System.out.println(rs.getString(3));
            }
        }
    }
}
