package com.lx.boot.client.retrofit.api;

import com.lx.boot.client.domain.Hotel;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

import java.util.List;

/**
 * @author shiny
 * @since 2016/10/18 17:53
 */
public interface HotelAPI {

    @GET("/hotel/getHotelWithQueryParameter")
    Hotel getHotelWithQueryParameter(@Query("hotelname") String hotelname);

    @POST("/hotel/getHotelList")
    public List<Hotel> getHotelList();

    @POST("/hotel/getHotelListWithBody")
    public List<Hotel> getHotelListWithBody(@Body Hotel hotel);

}
