package JBDCConnection;

import java.sql.*;

public class KetNoi {
    private static String jdbcURL = "jdbc:mysql://localhost:3306/product";
    private static String username = "root";
    private static String password = "anhlinh564th";

    public static Connection getConnection(){
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection(jdbcURL, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return c;
    }

}
