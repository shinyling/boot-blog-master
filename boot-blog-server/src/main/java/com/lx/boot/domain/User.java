package com.lx.boot.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author shiny
 * @since 2016/10/17 18:17
 */
@ConfigurationProperties(prefix = "user")
public class User {
    //@Value("${user.id}")
    private int id;
    //@value("wangna")
    private String username;

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
