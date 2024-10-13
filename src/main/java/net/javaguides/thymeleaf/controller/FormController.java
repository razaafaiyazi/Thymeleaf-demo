package net.javaguides.thymeleaf.controller;

import net.javaguides.thymeleaf.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    //localhost:9090/register
    @GetMapping("register")
    public String userRegistrationPage(Model model){

        //Empty userForm object to store form data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm",userForm);
        List<String> listProfessions = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("listProfessions",listProfessions);
        return "register-form";
    }

    //handle form submission
    @PostMapping("register/save")
    public String submitForm(Model model,
                             @ModelAttribute("userForm") UserForm userForm){
        model.addAttribute("userForm",userForm);
        return "registered-user";
    }
}
