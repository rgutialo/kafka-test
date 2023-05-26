package com.avoris.exam.test.model;

import java.util.List;

public class SearchDetails {

    private final String hotelId;
    private final String checkIn;
    private final String checkOut;
    private final List<Integer> ages;

    public SearchDetails(String hotelId, String checkIn, String checkOut, List<Integer> ages) {
        this.hotelId = hotelId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.ages = ages;
    }

    public String getHotelId() {
        return hotelId;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public List<Integer> getAges() {
        return ages;
    }

    @Override
    public String toString() {
        return "SearchDetails{" +
                "hotelId='" + hotelId + '\'' +
                ", checkIn='" + checkIn + '\'' +
                ", checkOut='" + checkOut + '\'' +
                ", ages=" + ages +
                '}';
    }
}
