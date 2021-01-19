package org.example.mensajes;

import java.util.Scanner;
import static org.example.mensajes.MessageService.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("----------------------");
            System.out.println("Messages App");
            System.out.println(" 1. Create Message");
            System.out.println(" 2. List Messages");
            System.out.println(" 3. Edit Message");
            System.out.println(" 4. Delete Message");
            System.out.println(" 0. Go out");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    create();
                    break;
                case 2:
                    findAll();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                default:
                    break;
            }

        } while (option != 0);

        System.out.println("You have successfully exited the program");
    }
}
