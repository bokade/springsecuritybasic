package com.example.SpringSecurityBasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    /**
     * To Access end points add console generated pass word to password field and username is user.
     * Acess using postman in authorization tab select basic auth , username is user and password generated on console
     * @return
     */
    @GetMapping("/user")
    public String userAPI() {
        return "Hello USER!";

    }

    @GetMapping("/admin")
    public String adminAPI() {
        return "Hello ADMIN!";

    }
}
