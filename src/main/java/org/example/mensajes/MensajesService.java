package org.example.mensajes;

import java.util.Scanner;

public class MensajesService {
    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        Mensajes registro = new Mensajes(mensaje, nombre);
        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMensajes() {
        MensajesDAO.leerMensajesDB();
    }

    public static void borrarMensaje() {

    }

    public static void editarMensaje() {

    }
}
