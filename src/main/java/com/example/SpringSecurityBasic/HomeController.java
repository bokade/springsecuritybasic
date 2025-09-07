package com.example.SpringSecurityBasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    /**
     * To Access end points add console generated pass word to password field and username is user.
     * Access using postman in authorization tab select basic auth , username is user and password generated on console
     *
     * Access By Custom Credential in application.properties file
     * By Postman in authorization tab select Basic Auth pass username and password from application.properties file
     *
     * Access by In Memory Credential and Role Based
     *  By Postman in authorization tab select Basic Auth pass username and password from SpringConfig.java as per role and end point to access
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
