package net.javaguides.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageExpressionController {

    //localhost:9090/message-expression
    @GetMapping("message-expression")
    public String messageExpression(){
        return "message-expression";
    }
}
