package com.example.askchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouteController { // POJP -> FrontController

    @GetMapping("/askView")
    public String askView() {
        return "ask";
    }
}
