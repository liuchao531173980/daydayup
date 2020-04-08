package com.daydayup.confgin.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RefreshController {
    @Value("${name}")
    private String name;

    @GetMapping(value = "/test" )
    public String test(){
        return name;
    }

}
