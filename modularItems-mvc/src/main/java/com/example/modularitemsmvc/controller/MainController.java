package com.example.modularitemsmvc.controller;

import com.example.modularItems.common.TestCommonClass;
import com.example.modularItems.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String main() {
        TestCommonClass.kuku();
        return "home";
    }


}
