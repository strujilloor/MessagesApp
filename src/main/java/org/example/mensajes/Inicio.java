package org.example.mensajes;

import java.sql.Connection;
import java.util.Scanner;
import static org.example.mensajes.MensajesService.*;

public class Inicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("----------------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. Crear mensaje");
            System.out.println(" 2. Listar mensajes");
            System.out.println(" 3. Editar mensaje");
            System.out.println(" 4. eliminar mensaje");
            System.out.println(" 0. salir");
            // leemos la opcion del usuario
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    crearMensaje();
                    break;
                case 2:
                    listarMensajes();
                    break;
                case 3:
                    editarMensaje();
                    break;
                case 4:
                    borrarMensaje();
                    break;
                default:
                    break;
            }

        } while (opcion != 0);

        System.out.println("Ha salido exitosamente del programa");
    }
}
