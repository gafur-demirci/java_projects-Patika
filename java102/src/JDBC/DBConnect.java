package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnect {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost/dvdrental";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","psql");
        try {
            Connection conn = DriverManager.getConnection(url, props);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
