package com.lx.boot.client.domain;

/**
 * @author shiny
 * @since 2016/10/18 15:19
 */
public class Hotel {

    private int id;

    private String hotelname;

    public Hotel() {
    }

    public Hotel(int id, String hotelname) {
        this.id = id;
        this.hotelname = hotelname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

}
