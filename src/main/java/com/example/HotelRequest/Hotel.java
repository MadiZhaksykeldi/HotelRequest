package com.example.HotelRequest;

public class Hotel {
    private String Id;
    private String name;
    private String city;
    private String stars;

    public Hotel(String id, String name, String city, String stars) {
        this.Id = id;
        this.name = name;
        this.city = city;
        this.stars = stars;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", stars=" + stars +
                '}';
    }
}