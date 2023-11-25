package com.seguros.apibackendseguros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiBackendSegurosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiBackendSegurosApplication.class, args);
    }
 @GetMapping("/")
    public String hola(){
        String saludo = "Hola Mundo desde Spring Boot";

        return saludo;
    }
}
