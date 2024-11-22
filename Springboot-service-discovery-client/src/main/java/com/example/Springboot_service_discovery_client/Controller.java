package com.example.Springboot_service_discovery_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service1")
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/externaldata")
    public String getExternalData()
    {
        String url="http://localhost:5050/service2/test";
        return restTemplate.getForObject(url,String.class);
    }
    @RequestMapping("/test")
    public String test()
    {
        return "Hello! this is service client 1";
    }

}
