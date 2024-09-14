package com.connect.ThymeLeafProj.controller;

import com.connect.ThymeLeafProj.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    //http://localhost:8080/variableExpression
    //handler method to handle variable-expression request
    @GetMapping("/variableExpression")
    public String variableExp(Model model){
        User user = new User("Rohan", "rohan@gmail.com", "Software Developer", "Male");
        model.addAttribute("user",user);
        return "variableExpression";
    }

    //handler method to handle selection expression
    @GetMapping("selectionExpression")
    public String selectionExp(Model model){
        User user = new User("Sohail", "sohail@gmail.com", "Cloud Engineer", "Male");
        model.addAttribute("user",user);
        return "selectionExpression";
    }

    //handler method to handle message expression
    @GetMapping("messageExpression")
    public String messageExp(){
        return "messageExpression";
    }

    //handler method to handle link expression
    @GetMapping("linkExpression")
    public String linkExp(Model model){
        model.addAttribute("id", 1);
        return "linkExpression";
    }

    //handler method to handle fragment expression request
    @GetMapping("fragmentExpression")
    public String fragExp(){
        return "fragmentExpression";
    }

    @GetMapping("/users")
    public String users(Model model){
        User admin = new User("Admin", "admin@gmail.com", "ADMIN", "Male");
        User ajay = new User("Ajay", "ajay@gmail.com", "USER", "Male");
        User neha = new User("Neha", "neha@gmail.com", "USER", "Female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(ajay);
        users.add(neha);
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/ifUnless")
    public String ifUnless(Model model){
        User admin = new User("Admin", "admin@gmail.com", "ADMIN", "Male");
        User ajay = new User("Ajay", "ajay@gmail.com", "USER", "Male");
        User neha = new User("Neha", "neha@gmail.com", "USER", "Female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(ajay);
        users.add(neha);
        model.addAttribute("users", users);
        return "ifUnless";
    }

    @GetMapping("switchCase")
    public String switchCase(Model model){
        User user = new User("Sabin", "sabin@gmail.com", "USER", "Male");
        model.addAttribute("user", user);
        return "switchCase";
    }
}
