package com.example.imh_mega.Fragments.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IncidentCheckerModel {

    @Expose
    @SerializedName("Incident ID")
    private String IncidentID;

    @Expose
    @SerializedName("Rider ID")
    private String RiderID;

    @Expose
    @SerializedName("Latitude")
    private String latitude;

    @Expose
    @SerializedName("Longitude")

    private String longitude;

    @Expose
    @SerializedName("Success")
    private boolean Success;

    public String getIncidentID() {
        return IncidentID;
    }

    public void setIncidentID(String incidentID) {
        IncidentID = incidentID;
    }

    public String getRiderID() {
        return RiderID;
    }

    public void setRiderID(String riderID) {
        RiderID = riderID;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean success) {
        Success = success;
    }
}
