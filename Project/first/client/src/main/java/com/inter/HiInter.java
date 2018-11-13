package com.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVICE-SERVER")
public interface HiInter {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHello();

}
