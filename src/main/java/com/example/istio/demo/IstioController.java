package com.example.istio.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class IstioController {

    @GetMapping("/istio")
    public Map<String, String> istio(@RequestHeader Map<String, String> headers){
        return headers;
    }
}
