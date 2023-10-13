package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.services.UserService;
import ru.kata.spring.boot_security.demo.services.UserServiceImpl;

import java.security.Principal;

@Controller
public class UserControllers {

    private UserService userServiceImpl;
    @Autowired
    public UserControllers(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/user")
    public String userByUsername(Model model, Principal principal) {

        model.addAttribute("user", userServiceImpl.findByUsername(principal.getName()));
       // model.addAttribute("user", userService.getUser(id));
        return "user.userById";
    }
}
