package org.example.mensajes;

import java.sql.Connection;

public class Inicio {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();

        try (Connection conn = conexion.get_connection()) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
