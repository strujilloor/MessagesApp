package org.example.mensajes;

public class Message {
    int messageId;
    String message;
    String author;
    String dateTime;

    public Message() {}

    public Message(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public Message(String message, String author, String dateTime) {
        this.message = message;
        this.author = author;
        this.dateTime = dateTime;
    }

    public Message(int messageId, String message) {
        this.messageId = messageId;
        this.message = message;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
