package com.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVICE-SERVER",fallback = HiHy.class)
public interface HiInter {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHello();

}

@Component
class HiHy implements HiInter{
    @Override
    public String sayHello() {
        return "Sorry,Service is error!";
    }
}
