package com.lx.boot.web;

import com.lx.boot.dto.BackendDTO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shiny
 * @since 2016/10/19 14:44
 */
@RestController
@RequestMapping("api")
@ConfigurationProperties(prefix = "greeting")
public class GreeterRestController {

    private RestTemplate restTemplate=new RestTemplate();

    private String saying;

    private String backendServiceHost;

    private int backendServicePort;

    @RequestMapping(value = "/greeting",method = RequestMethod.GET,produces = "text/plain")
    public String greeting(){
        String backendServiceUrl=String.format(
                "http://%s:%d/api/backend?greeting={greeting}",backendServiceHost,backendServicePort);
        System.out.println("Sending to: "+backendServiceUrl);
        BackendDTO response=restTemplate.getForObject(backendServiceUrl, BackendDTO.class,saying);
        return response.getGreeting()+" at host: "+response.getIp();
    }
}
