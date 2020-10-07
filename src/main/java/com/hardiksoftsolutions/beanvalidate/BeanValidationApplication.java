package com.hardiksoftsolutions.beanvalidate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@SpringBootApplication
public class BeanValidationApplication {

    @Validated
    @RestController
    class UserController {

        @PostMapping("/validateEmployee")
        ResponseEntity<String> addUser(@Valid @RequestBody Employee employee) {
            // persisting the user
            return ResponseEntity.ok("User is valid");
        }

        // standard constructors / other methods

    }

    public static void main(String[] args) {
        SpringApplication.run(BeanValidationApplication.class, args);
    }

}
