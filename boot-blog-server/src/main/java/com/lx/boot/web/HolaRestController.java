package com.lx.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author shiny
 * @since 2016/10/19 11:53
 */
@RestController
@RequestMapping("/api")
public class HolaRestController {

    @RequestMapping(method = RequestMethod.GET,value = "/hola",produces = "text/plain")
    public String hola(){
        String hostname=null;
        try {
            hostname= InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            hostname="unknown";
        }
        return  "Hola Spring Boot de "+hostname;
    }
}
