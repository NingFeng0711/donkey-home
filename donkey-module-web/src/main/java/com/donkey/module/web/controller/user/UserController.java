package com.donkey.module.web.controller.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: donkey-home
 * @ClassName UserController
 * @description:
 * @author: lijinpeng
 * @create: 2026-06-02 14:02
 * @Version 1.0
 **/
@RestController
public class UserController {

    @PostMapping("/user")
    public String user() {
        return "user";
    }

    @PostMapping("/login")
    public String login() {
        return "login";
    }

}
