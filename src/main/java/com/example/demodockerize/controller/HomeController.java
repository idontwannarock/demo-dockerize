package com.example.demodockerize.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Home")
@RequestMapping("home")
@RestController
public class HomeController {

    @ApiOperation(value = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("Hello World!");
    }
}
