package net.javaguides.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    //http://localhost:9090/hello-world
    @GetMapping("/hello-world")
    public String helloWorld(Model model){
        model.addAttribute("message","Hello World");
        return "Hello_World";
    }
}
