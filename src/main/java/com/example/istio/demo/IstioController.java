package com.example.istio.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class IstioController {

    Logger logger = LoggerFactory.getLogger(IstioController.class);

    @GetMapping("/istio")
    public Map<String, String> istio(@RequestHeader Map<String, String> headers){
        logger.info("Request received at {}: GET /istio ", LocalDateTime.now());
        return headers;
    }
}
