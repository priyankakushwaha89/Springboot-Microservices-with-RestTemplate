package com.example.Springboot_service_discovery_client_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service2")
public class Controller
{
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/externaldata")
    public String getExternalData()
    {
        String url="http://localhost:4040/service1/test";
        return restTemplate.getForObject(url,String.class);
    }
    @RequestMapping("/test")
    public String test()
    {
        return "This is service client 2";
    }
}
