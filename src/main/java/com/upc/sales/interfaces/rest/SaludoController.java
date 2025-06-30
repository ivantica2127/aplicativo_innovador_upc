package com.upc.sales.interfaces.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SaludoController {
    @GetMapping(value = "saludo")
    public String saludo(){
        return "Esto es mi endpoint final de mi proyecto innovador UPC";
    }
}
