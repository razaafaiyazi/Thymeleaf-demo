package net.javaguides.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LinkExpressionController {


    //localhost:9090/link-expression
    @GetMapping("link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id",1);
        return "link-expression";
    }
    //handler method for link with parameter
    @GetMapping("/link-expression/{id}")
    public String linkWithParam(@PathVariable("id") Long id,Model model){
        model.addAttribute("id",id);
        return "link-expression";
    }
}
