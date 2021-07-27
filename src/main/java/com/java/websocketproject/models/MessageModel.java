package com.java.websocketproject.models;


public class MessageModel {

    private String message;
    private String fromlogin;


    public MessageModel() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFromlogin() {
        return fromlogin;
    }

    public void setFromlogin(String fromlogin) {
        this.fromlogin = fromlogin;
    }
}
