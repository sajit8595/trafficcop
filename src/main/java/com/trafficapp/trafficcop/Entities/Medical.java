package com.trafficapp.trafficcop.Entities;

public class Medical extends Location{
    
    private String numberOfPeople;
    private String typeOfAccident;


    public Medical(String id, String location, String contact, Boolean helpSent, String numberOfPeople, String typeOfAccident) {
        super(id, location, contact, helpSent);
        this.numberOfPeople = numberOfPeople;
        this.typeOfAccident = typeOfAccident;
    }
    
    public Medical(){
        super();
    }

    public String getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(String numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getTypeOfAccident() {
        return typeOfAccident;
    }

    public void setTypeOfAccident(String typeOfAccident) {
        this.typeOfAccident = typeOfAccident;
    }
    
    
}
