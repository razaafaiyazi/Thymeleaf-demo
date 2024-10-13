package net.javaguides.thymeleaf.controller;

import net.javaguides.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectionExpressionController {

    //localhost:9090/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model){
        User user = new User("Masrur","masrur@gmail.com","USER","Male");
        model.addAttribute("user",user);
        return "selection-expression";
    }
}
