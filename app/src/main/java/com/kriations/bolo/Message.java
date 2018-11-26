package com.kriations.bolo;

import java.util.Date;

public class Message {
    private String text;
    private String user;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    private long time;

    public Message(String text, String user) {
        this.text = text;
        this.user = user;
        this.time = new Date().getTime();
    }

    public Message(){

    }


}
