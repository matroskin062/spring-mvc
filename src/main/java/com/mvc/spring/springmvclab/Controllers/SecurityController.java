package com.mvc.spring.springmvclab.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {
    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public ModelAndView loginPage(Model modelAndView, String error){
        if(error != null)
            modelAndView.addAttribute("error", "Username or password invalid");
        return new ModelAndView("login");
    }
}
