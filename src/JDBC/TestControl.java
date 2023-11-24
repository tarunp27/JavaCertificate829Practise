package JDBC;

import java.sql.*;

public class TestControl {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/zoo";
        String user = "root";
        String password = "password";

//        Connection conn = DriverManager.getConnection(url,user,password);
//        System.out.println(conn);

        try ( Connection conn = DriverManager.getConnection(url,user,password)) {

            // run(conn,"DROP TABLE names");
            // run(conn,"DROP TABLE exhibits");

//        run(conn,"CREATE TABLE exhibits ("
//                + "id INTEGER PRIMARY KEY, "
//                + "name VARCHAR(254), "
//                + "num_acres DECIMAL(4,1))");

//            run(conn,"CREATE TABLE names3 ("
//                    + "id INTEGER PRIMARY KEY, "
//                    + "species_id integer REFERENCES exhibits (id), "
//                    + "name VARCHAR(255))");

//            run(conn,"INSERT INTO exhibits VALUES (5, 'African Elephant', 7.5)");
//            run(conn,"INSERT INTO exhibits VALUES (6, 'Zebra', 1.2)");

            run(conn,"INSERT INTO names3 VALUES (1, 5, 'Elsa')");
            run(conn,"INSERT INTO names3 VALUES (2, 6, 'Zelda')");
            run(conn,"INSERT INTO names3 VALUES (3, 5, 'Ester')");
            run(conn,"INSERT INTO names3 VALUES (4, 5, 'Eddie')");
            run(conn,"INSERT INTO names3 VALUES (5, 6, 'Zoe')");

            printCount(conn,"SELECT count(*) FROM names3");

        }
    }

    private static void run(Connection conn, String sql) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.executeUpdate();
        }
    }

    private static void printCount(Connection conn, String sql) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            System.out.println(rs.getInt(1));
        }
    }
}
