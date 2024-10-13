package net.javaguides.thymeleaf.controller;

import net.javaguides.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class LoopingInThymeleaf {

    //localhost:9090/iteration-demo
    @GetMapping("iteration-demo")
    public String loopingInThymeleaf(Model model){
        List<User> users = Arrays.asList(new User("Razaa", "razaa@gmail.com", "ADMIN", "Male"),
                new User("Masrur", "masrur@gmail.com", "ADMIN", "MALE"),
                new User("Naushin", "naushin@gmail.com", "USER", "Female"),
                new User("Arham", "arham@gmail.com", "USER", "Male"));
        model.addAttribute("users",users);
        return "users";
    }
}
