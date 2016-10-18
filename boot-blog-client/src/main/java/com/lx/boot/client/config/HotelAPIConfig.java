package com.lx.boot.client.config;

import com.lx.boot.client.retrofit.api.HotelAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit.RestAdapter;

/**
 * @author shiny
 * @since 2016/10/18 17:58
 */
@Configuration
public class HotelAPIConfig {

    @Autowired
    private RestAdapter adapter;

    @Bean
    public HotelAPI getHotelAPI(){
        return adapter.create(HotelAPI.class);
    }
}
