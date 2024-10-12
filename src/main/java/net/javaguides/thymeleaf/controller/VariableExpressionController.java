package net.javaguides.thymeleaf.controller;

import net.javaguides.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VariableExpressionController {
    //define handler method
    // http://localhost:9090/variable-expression
    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        User user = new User("Razaa","razaa@gmail.com","ADMIN","Male");
        model.addAttribute("user",user);
        return "variable-expression";
    }
}
