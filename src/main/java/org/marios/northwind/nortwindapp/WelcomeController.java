package org.marios.northwind.nortwindapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        String welcomeMsg = "Hi!";
        return welcomeMsg;
    }
}
