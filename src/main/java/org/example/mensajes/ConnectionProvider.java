package org.example.mensajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    public Connection getConnection() {
        Connection connection = null;
        final String DATABASE = "mensajes_app";
        final String URL = "jdbc:mysql://localhost:3306/" + DATABASE;
        final String USER = "root";
        final String PASSWORD = "stiven1293";
        try {
            connection = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );
        } catch(SQLException e) {
            System.out.println(e);
        }
        return connection;
    }

}
