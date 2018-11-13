package com.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientServer {

    @Autowired
    RestTemplate restTemplate;

    public String client(String name){

        System.out.println(name);
        return restTemplate.getForObject("http://SERVICE-SERVER/hello",String.class);
    }

}
