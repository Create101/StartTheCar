package com.server;

import org.springframework.stereotype.Service;

@Service
public class RestServer {

    public String test(){
        return "这是Service2!s";
    }

}
