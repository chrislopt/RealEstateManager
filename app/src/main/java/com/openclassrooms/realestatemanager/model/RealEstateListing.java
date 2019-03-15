package com.openclassrooms.realestatemanager.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.openclassrooms.realestatemanager.utils.ListTypeConverters;

import java.util.List;

@Entity(tableName = "realEstateListings")
@TypeConverters(ListTypeConverters.class)
public class RealEstateListing {
    @PrimaryKey(autoGenerate = true)
    private Integer id;

    private String type;
    private int priceInDollars;
    private int surfaceArea;
    private int numberOfRooms;
    private String description;
    private List<String> photos = null;
    private String address;
    private List<String> pointsOfInterest = null;
    private String status;
    private long datePutInMarket;
    private long saleData;
    private String agentID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPriceInDollars() {
        return priceInDollars;
    }

    public void setPriceInDollars(int priceInDollars) {
        this.priceInDollars = priceInDollars;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(int surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getPointsOfInterest() {
        return pointsOfInterest;
    }

    public void setPointsOfInterest(List<String> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getDatePutInMarket() {
        return datePutInMarket;
    }

    public void setDatePutInMarket(long datePutInMarket) {
        this.datePutInMarket = datePutInMarket;
    }

    public long getSaleData() {
        return saleData;
    }

    public void setSaleData(long saleData) {
        this.saleData = saleData;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}