package com.shamyook.forgithub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "김용승님 환영합니다!!";
    }
}
