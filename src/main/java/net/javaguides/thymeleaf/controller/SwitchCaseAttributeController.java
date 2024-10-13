package net.javaguides.thymeleaf.controller;

import net.javaguides.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class SwitchCaseAttributeController {

    //localhost:9090/switch-case
    @GetMapping("switch-case")
    public String switchCase(Model model){
        User user = new User("Razaa","razaa@gmail.com","ADMIN","Male");
        model.addAttribute("user",user);
        return "switch-case";
    }
}
