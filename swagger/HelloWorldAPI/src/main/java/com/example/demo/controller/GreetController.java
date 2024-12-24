package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/api")
@Tag(name = "Greeting API", description = "API for greeting messages")
public class GreetController {

    @Operation(summary = "Greet a user", description = "Returns a greeting message")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @GetMapping("/greet")
    public String greet() {
        return "Hello, World!";
    }
}
