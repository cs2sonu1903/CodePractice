package com.sonu.stream.interview;

public class Address {
    private String primaryAddress;
    private String city;
    private String state;

    public Address(String primaryAddress, String city, String state) {
        this.primaryAddress = primaryAddress;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "primaryAddress='" + primaryAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(String primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
