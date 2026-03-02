package com.example.Tienda_Pablo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Paulus {
    @GetMapping("Test")
    public String Testapp(){
        return "Hola mundo";
    }
}
