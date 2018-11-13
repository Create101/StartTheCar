package com.api;

import com.inter.HiInter;
import com.server.ClientServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientApi {

    @Autowired
    private ClientServer clientServer;
    @Autowired
    private HiInter hiInter;

    @GetMapping(value = "/value/{name}")
    public String test(@PathVariable("name") String name){
       return clientServer.client(name);
    }

    @GetMapping(value = "/hi")
    public String sayHi(){
        return hiInter.sayHello();
    }

}
