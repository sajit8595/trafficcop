package com.trafficapp.trafficcop.Entities;

public class Violation {
    private String date;
    private String drivingLicence;
    private String location;
    private String other;
    private String time;
    private String vehicleDetails;
    private String violationType;
    private String violatorsName;
    private String id;
    private String fineAmount;
    private Boolean paid;


    
    public Violation() {
        super();
    }



    public Violation(String date, String drivingLicence, String location, String other, String time,
            String vehicleDetails, String violationType, String violatorsName, String id, String fineAmount,
            Boolean paid) {
        this.date = date;
        this.drivingLicence = drivingLicence;
        this.location = location;
        this.other = other;
        this.time = time;
        this.vehicleDetails = vehicleDetails;
        this.violationType = violationType;
        this.violatorsName = violatorsName;
        this.id = id;
        this.fineAmount = fineAmount;
        this.paid = paid;
    }



    public String getDate() {
        return date;
    }



    public void setDate(String date) {
        this.date = date;
    }



    public String getDrivingLicence() {
        return drivingLicence;
    }



    public void setDrivingLicence(String drivingLicence) {
        this.drivingLicence = drivingLicence;
    }



    public String getLocation() {
        return location;
    }



    public void setLocation(String location) {
        this.location = location;
    }



    public String getOther() {
        return other;
    }



    public void setOther(String other) {
        this.other = other;
    }



    public String getTime() {
        return time;
    }



    public void setTime(String time) {
        this.time = time;
    }



    public String getVehicleDetails() {
        return vehicleDetails;
    }



    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }



    public String getViolationType() {
        return violationType;
    }



    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }



    public String getViolatorsName() {
        return violatorsName;
    }



    public void setViolatorsName(String violatorsName) {
        this.violatorsName = violatorsName;
    }



    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public String getFineAmount() {
        return fineAmount;
    }



    public void setFineAmount(String fineAmount) {
        this.fineAmount = fineAmount;
    }



    public Boolean getPaid() {
        return paid;
    }



    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    


}