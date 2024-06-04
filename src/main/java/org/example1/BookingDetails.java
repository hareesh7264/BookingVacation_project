package org.example1;

public class BookingDetails {
    private String name;
    private String placetovisit;
    private String bookingtype;
    private int noOfPeopletoStay;
    private int noOfDaystoStay;

    // Constructor with parameters
    public BookingDetails(String name, String placetovisit, String bookingtype, int noOfPeopletoStay, int noOfDaystoStay) {
        this.name = name;
        this.placetovisit = placetovisit;
        this.bookingtype = bookingtype;
        this.noOfPeopletoStay = noOfPeopletoStay;
        this.noOfDaystoStay = noOfDaystoStay;
    }

    // Default constructor
    public BookingDetails() {}

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for placetovisit
    public String getPlacetovisit() {
        return placetovisit;
    }

    public void setPlacetovisit(String placetovisit) {
        this.placetovisit = placetovisit;
    }

    // Getter and setter for bookingtype
    public String getBookingtype() {
        return bookingtype;
    }

    public void setBookingtype(String bookingtype) {
        this.bookingtype = bookingtype;
    }

    // Getter and setter for noOfPeopletoStay
    public int getNoOfPeopletoStay() {
        return noOfPeopletoStay;
    }

    public void setNoOfPeopletoStay(int noOfPeopletoStay) {
        this.noOfPeopletoStay = noOfPeopletoStay;
    }

    // Getter and setter for noOfDaystoStay
    public int getNoOfDaystoStay() {
        return noOfDaystoStay;
    }

    public void setNoOfDaystoStay(int noOfDaystoStay) {
        this.noOfDaystoStay = noOfDaystoStay;
    }
}
