package com.example.HotelRequest;

public class HotelRequest {
    private String hotelId;
    private Hotel hotel;

    public HotelRequest(){

    }

    public HotelRequest(String hotelId, Hotel hotel){
        this.hotelId = hotelId;
        this.hotel = hotel;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "HotelRequest{" +
                "hotelId='" + hotelId + '\'' +
                ", hotel=" + hotel +
                '}';
    }
}
