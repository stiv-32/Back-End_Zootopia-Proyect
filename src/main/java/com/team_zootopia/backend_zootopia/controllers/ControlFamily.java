package com.team_zootopia.backend_zootopia.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlFamily {
    
     @GetMapping()
     public String index(){
     return "CONECTADO";
     }
}
