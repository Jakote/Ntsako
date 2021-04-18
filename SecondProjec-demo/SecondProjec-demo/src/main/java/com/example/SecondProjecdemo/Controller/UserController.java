package com.example.SecondProjecdemo.Controller;

import com.example.SecondProjecdemo.Service.UserService;
import com.example.SecondProjecdemo.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //Display list of users
    @GetMapping("/users")
    public String viewUsers(Model model){
        model.addAttribute("listUsers", userService.getAllUsers());
        return "users";
    }
}
