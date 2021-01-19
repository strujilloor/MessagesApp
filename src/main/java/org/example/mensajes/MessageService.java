package org.example.mensajes;

import java.util.Scanner;

public class MessageService {
    public static void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your message");
        String message = sc.nextLine();
        System.out.println("Type your name");
        String name = sc.nextLine();
        Message newMessage = new Message(message, name);
        MessageDAO.create(newMessage);
    }

    public static void findAll() {
        MessageDAO.findAll();
    }

    public static void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indicate the ID of the message to be deleted");
        int messageId = sc.nextInt();
        MessageDAO.delete(messageId);
    }

    public static void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your new message");
        String message = sc.nextLine();
        System.out.println("Indicate the ID of the message to be updated");
        int messageId = sc.nextInt();
        Message newMessage = new Message(messageId, message);
        MessageDAO.update(newMessage);
    }
}
