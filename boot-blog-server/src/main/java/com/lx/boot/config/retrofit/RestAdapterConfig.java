package com.lx.boot.config.retrofit;

import org.springframework.context.annotation.Configuration;
import retrofit.RestAdapter;

/**
 * @author shiny
 * @since 2016/10/18 16:16
 */
@Configuration
public class RestAdapterConfig {

    /**
     * 获取RestAdapter单例
     * @return
     */
    public RestAdapter getRestAdapter(){
        /**
         * setEndpoint("http://localhost:8081"):指定基本的URL，
         * API接口中的URL是相对于该URL的路径的，
         * 不能少了协议名，例如写成：localhost:8081就不行
         */
        RestAdapter adapter=new RestAdapter.Builder()
                .setEndpoint("http://localhost:8081")
                .build();
        return adapter;
    }
}
