package com.example.SecondProjecdemo.Controller;

import com.example.SecondProjecdemo.Service.UserService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    @Autowired
    private UserService userService;

    //Display list of users
    @GetMapping("/users")
    public String viewUsers(Model model){
        model.addAttribute("listUsers",userService.getAllUsers());
        return "users";
    }
}
