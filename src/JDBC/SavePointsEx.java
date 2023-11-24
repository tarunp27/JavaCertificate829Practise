package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SavePointsEx {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/zoo";
        String user = "root";
        String password = "password";

        var insertSql = "INSERT INTO exhibits VALUES(34,'WILD DEER4',3)";

        Connection conn = DriverManager.getConnection(url, user, password);
        conn.setAutoCommit(false);

        try (var ps = conn.prepareStatement(insertSql)) {
            int result = ps.executeUpdate();
            System.out.println(result);

            var larry = conn.setSavepoint();
            var curly = conn.setSavepoint();
            var moe = conn.setSavepoint();
            //var shemp = conn.setSavepoint();


           // conn.rollback();
            conn.rollback(curly);

        }
    }
}
