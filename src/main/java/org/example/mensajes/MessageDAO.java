package org.example.mensajes;

import java.sql.*;

public class MessageDAO {
    private static final String SELECT_ALL_SQL =
            "SELECT * FROM mensajes";
    private static final String CREATE_SQL =
            "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
    private static final String UPDATE_SQL =
            "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
    private static final String DELETE_SQL =
            "DELETE FROM mensajes WHERE id_mensaje = ?";

    public static void create(Message message) {
        ConnectionProvider db_connect = new ConnectionProvider();
        try (Connection connection = db_connect.getConnection()){
            PreparedStatement ps = null;
            try {
                String query = CREATE_SQL;
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setString(2, message.getAuthor());
                ps.executeUpdate();
                System.out.println("::Message created::");
            } catch(SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void findAll() {
        ConnectionProvider db_connect = new ConnectionProvider();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try(Connection connection = db_connect.getConnection()) {
            String query = SELECT_ALL_SQL;
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("Message: " + rs.getString("mensaje"));
                System.out.println("Author: " + rs.getString("autor_mensaje"));
                System.out.println("DateTime: " + rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        } catch(SQLException e) {
            System.out.println("::Could not get messages::");
            System.out.println(e);
        }
    }

    public static void delete(int messageId) {
        ConnectionProvider db_connect = new ConnectionProvider();
        try(Connection connection = db_connect.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = DELETE_SQL;
                ps = connection.prepareStatement(query);
                ps.setInt(1, messageId);
                ps.executeUpdate();
                System.out.println("::The message has been deleted::");
            } catch(SQLException ex) {
                System.out.println(ex);
                System.out.println("::The message could not be deleted::");
            }
        } catch(SQLException e) {
            System.out.println(e);
        }
    }

    public static void update(Message message) {
        ConnectionProvider db_connect = new ConnectionProvider();
        try(Connection conexion = db_connect.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = UPDATE_SQL;
                ps = conexion.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setInt(2, message.getMessageId());
                ps.executeUpdate();
                System.out.println("::The message has been updated successfully::");
            } catch(SQLException ex) {
                System.out.println(ex);
                System.out.println("::Could not update message::");
            }
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}
