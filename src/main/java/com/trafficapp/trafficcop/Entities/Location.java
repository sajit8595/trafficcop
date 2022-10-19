package com.trafficapp.trafficcop.Entities;

public class Location {
    private String location;
    private String contact;
    private Boolean helpSent;
    private String id;
    
    public Location(String id, String location, String contact, Boolean helpSent) {
        this.location = location;
        this.contact = contact;
        this.helpSent = helpSent;
        this.id = id;
    }

    public Location() {
        super();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Boolean getHelpSent() {
        return helpSent;
    }

    public void setHelpSent(Boolean helpSent) {
        this.helpSent = helpSent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
}
