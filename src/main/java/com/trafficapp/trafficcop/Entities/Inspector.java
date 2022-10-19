package com.trafficapp.trafficcop.Entities;

public class Inspector {
    private String name;
    private String contact;
    private String username;
    private String password;
    private String id;

    public Inspector(String name, String contact, String username, String password, String id) {
        this.name = name;
        this.contact = contact;
        this.username = username;
        this.password = password;
        this.id = id;
    }

    
    public Inspector() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    



    
}
