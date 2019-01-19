package com.mvc.spring.springmvclab.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {
    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public ModelAndView loginPage(){
        return new ModelAndView("login");
    }
}
