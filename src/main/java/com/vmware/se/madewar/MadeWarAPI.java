package com.vmware.se.madewar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MadeWarAPI {

    @GetMapping("/")
    //@ResponseBody
    public String hello() {
        return "hello, world";
    }
}