package com.example.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping("userServiceFallBack")
    public String userServiceFallBackMethod(){
        return "User Service is taking longer than expected."+
                "Please try again later";
    }
    @GetMapping("deptServiceFallBack")
    public String deptServiceFallBackMethod(){
        return "Department Service is taking longer than expected."+
                "Please try again later";
    }
}
