package com.teachmeskills.example;

public class Flat {
    private int entranceNumber;
    private int floorNumber;
    private int flatNumber;
    private int roomNumber;
    private int residentsNumbers;
    private double square;
    private String owner;
    private Sex ownerSex;

    @Override
    public String toString() {
        return "Flat{" +
                "entranceNumber=" + entranceNumber +
                ", floorNumber=" + floorNumber +
                ", flatNumber=" + flatNumber +
                ", roomNumber=" + roomNumber +
                ", residentsNumbers=" + residentsNumbers +
                ", square=" + square +
                ", owner='" + owner + '\'' +
                ", ownerSex=" + ownerSex +
                '}';
    }

    public Flat(int entranceNumber, int floorNumber, int flatNumber, int roomNumber, int residentsNumbers, double square, String owner, Sex ownerSex) {
        this.entranceNumber = entranceNumber;
        this.floorNumber = floorNumber;
        this.flatNumber = flatNumber;
        this.roomNumber = roomNumber;
        this.residentsNumbers = residentsNumbers;
        this.square = square;
        this.owner = owner;
        this.ownerSex = ownerSex;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getEntranceNumber() {
        return entranceNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getResidentsNumbers() {
        return residentsNumbers;
    }

    public double getSquare() {
        return square;
    }

    public String getOwner() {
        return owner;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public Sex getOwnerSex() {
        return ownerSex;
    }
}

