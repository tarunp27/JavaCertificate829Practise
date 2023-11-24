package JDBC;

import java.sql.*;

public class JdbcExample {
    static final String url = "jdbc:mysql://localhost:3306/test";
    static final String user = "root";
    static final String password = "password";
    static final String query = "SELECT customer_id,first_name,last_name,age,country FROM customers";

    public static void main(String[] args) throws SQLException {

        try(Connection connect = DriverManager.getConnection(url,user,password);
            Statement stm = connect.createStatement();
            ResultSet rs = stm.executeQuery(query);)
        {
            while(rs.next()){
                System.out.print("ID: " + rs.getInt("customer_id"));
                System.out.print(", First Name: " + rs.getString("first_name"));
                System.out.print(", Last Name: " + rs.getString("last_name"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(",Country: " + rs.getString("country"));
                System.out.println();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
