package JDBC;

import java.sql.*;

public class Callableprog2 {
    public static void main(String[] args) throws SQLException {

        String url ="jdbc:mysql://localhost:3306/zoo" ;
        String user = "root";
        String password = "password";

        Connection con = DriverManager.getConnection(url,user,password);

        String sql = "{call read_names_by_letter(?)}";

        try(var cs = con.prepareCall(sql)){
            cs.setString("alpha","N");

        try(var rs = cs.executeQuery()){
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
            }
        }
        System.out.println("----using magic_number()");
        // using out parameter
//        sql = "{? = call magic_number(?)}";
        sql = "{call magic_number1(?, ?)}";
        try(var cs1 = con.prepareCall(sql)){
//            cs1.registerOutParameter(1,Types.INTEGER);
            cs1.registerOutParameter(1,JDBCType.DOUBLE);
            cs1.setInt (2,100);
            cs1.executeQuery();
            System.out.println(cs1.getDouble("rand"));
        }
    }
}

