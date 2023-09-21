package com.shamyook.forgithub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoginControllerTests {


    private LoginController loginController;

    @Autowired
    public LoginControllerTests(LoginController loginController) {
        this.loginController = loginController;
    }

    @Test
    public void loginTest() {
        Assertions.assertEquals("김용승님 환영합니다!", loginController.login());
    }
}
